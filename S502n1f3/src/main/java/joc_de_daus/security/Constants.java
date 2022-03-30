package joc_de_daus.security;

public class Constants {

	// Spring Security
	public static final String HTTP_METHOD_POST_lOGIN = "/login";
	public static final String HTTP_METHOD_POST_USERS_REGISTRAR = "/users/registrar";
	public static final String HTTP_METHOD_GET_USERS = "/users";
	public static final String HTTP_METHOD_GET_USERS_USERNAME = "/users/**";
	public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
	public static final String TOKEN_BEARER_PREFIX = "Bearer ";

	// JWT
	public static final String ISSUER_INFO = "https://www.barcelonactiva.cat/es/itacademy";
	public static final String SIGNING_KEY = "MyJwtSecret";
	public static final long TOKEN_EXPIRATION_TIME = 864_000_000; // 10 day

}
