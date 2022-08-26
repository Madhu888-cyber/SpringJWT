package com.app.SpringJWT.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.SpringJWT.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);
}
