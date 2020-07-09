package com.lyes.auth.services;

import com.lyes.auth.model.User;

public interface UserService {
	void save(User user);
	User findUsername(String username);
}
