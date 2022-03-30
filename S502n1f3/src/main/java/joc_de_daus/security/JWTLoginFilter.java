package joc_de_daus.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import joc_de_daus.model.entity.Usuari;

public class JWTLoginFilter extends UsernamePasswordAuthenticationFilter {
	
	private AuthenticationManager authenticationManager;
	
	public JWTLoginFilter(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}
	
	// Recibir y analizar credenciales de usuario
	@Override
	public Authentication attemptAuthentication(HttpServletRequest req,
			HttpServletResponse res) throws AuthenticationException {
		
		try {
			Usuari usuari = new ObjectMapper()
				.readValue(req.getInputStream(), Usuari.class);
			return authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(
					usuari.getUsername(),
					usuari.getPassword(),
					new ArrayList<>())
					);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	// Después de que el usuario inicie sesión correctamente, se llamará a este método, generamos un token en este método
	@Override
	protected void successfulAuthentication(HttpServletRequest req,
		HttpServletResponse res,
		FilterChain chain,
		Authentication auth) throws IOException, ServletException {
		
		String token = Jwts.builder()
			.setSubject(((org.springframework.security.core.userdetails.User) auth.getPrincipal()).getUsername())
			.setExpiration( new Date(System.currentTimeMillis() + Constants.TOKEN_EXPIRATION_TIME))
			.signWith(SignatureAlgorithm.HS512, Constants.SIGNING_KEY)
			.compact();
		res.addHeader(Constants.HEADER_AUTHORIZACION_KEY, Constants.TOKEN_BEARER_PREFIX + token);
	}
}
