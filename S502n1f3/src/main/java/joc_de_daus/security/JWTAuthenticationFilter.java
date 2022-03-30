package joc_de_daus.security;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import io.jsonwebtoken.Jwts;

public class JWTAuthenticationFilter extends BasicAuthenticationFilter {
	
	public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
		
		super(authenticationManager);
	}
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String header = request.getHeader(Constants.HEADER_AUTHORIZACION_KEY);
		
		if (header == null || !header.startsWith(Constants.TOKEN_BEARER_PREFIX)) {
			chain.doFilter(request, response);
			return;
		}
		UsernamePasswordAuthenticationToken authentication = getAuthentication(request);
		SecurityContextHolder.getContext().setAuthentication(authentication);
		chain.doFilter(request, response);
	}
	
	private UsernamePasswordAuthenticationToken getAuthentication(HttpServletRequest request) {
		
		String token = request.getHeader(Constants.HEADER_AUTHORIZACION_KEY);
		
		if (token != null) {
			// parse the token.
			String usuari = Jwts.parser()
				.setSigningKey(Constants.SIGNING_KEY)
				.parseClaimsJws(token.replace( Constants.TOKEN_BEARER_PREFIX, ""))
				.getBody()
				.getSubject();
			if (usuari != null) {
				return new UsernamePasswordAuthenticationToken(usuari, null, new ArrayList<>());
			}
			return null;
		}
		return null;
	}
}