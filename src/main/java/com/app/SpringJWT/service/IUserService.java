package com.app.SpringJWT.service;

import java.util.Optional;

import com.app.SpringJWT.model.User;

public interface IUserService {

	Integer saveUser(User user);
	Optional<User> findByUsername(String username);
}
