package com.sham.springboot.parkourhotspot.interfaces.controllers;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sham.springboot.parkourhotspot.domain.authentication.Role;
import com.sham.springboot.parkourhotspot.domain.authentication.SecurityService;
import com.sham.springboot.parkourhotspot.domain.authentication.User;

@RestController
public class UsuarioController {

	@Autowired
	SecurityService service;
	
	@RequestMapping("/user")
	public User user() {
		User user = new User();
		user.setEmail("sham.vinicius@gmail.com");
		user.setName("Sham Vinicius Fiorin");
		user.setRoles(Arrays.asList(new Role("ROLE_ADMIN")));
		user.setUser("sham");
		user.setPassword("123");

		return service.createUser(user);
		
	}

}
