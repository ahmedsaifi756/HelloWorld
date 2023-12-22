package com.niami.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.niami.springboot.dto.UserRegistrationDto;
import com.niami.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
