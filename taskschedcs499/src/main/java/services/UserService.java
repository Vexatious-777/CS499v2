package services;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class UserService {
	public String hashPassword(String plainPassword) {
		return BCrypt.withDefaults().hashToString(12, plainPassword.toCharArray());
	}

}
