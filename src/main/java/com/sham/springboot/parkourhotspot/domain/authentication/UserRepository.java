package com.sham.springboot.parkourhotspot.domain.authentication;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

	public Optional<User> findByUser(String user);
	
}
