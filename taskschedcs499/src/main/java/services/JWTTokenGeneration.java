package services;

import io.smallrye.jwt.build.Jwt;


import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

public class JWTTokenGeneration {
	
	public static String generateToken(String username) {
		return Jwt.issuer("https://localhost:8080/issuer")
				.upn(username)
				.groups(new HashSet<>(Arrays.asList("User", "Admin")))
				.expiresIn(TimeUnit.HOURS.toMillis(2))
				.sign();
	}

}
