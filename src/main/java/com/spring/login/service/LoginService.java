package com.spring.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.login.entity.Login;
import com.spring.login.repository.LoginRepository;
import java.util.Optional;

@Service
public class LoginService {
	@Autowired
	private LoginRepository loginRepository;
	
	 public Optional<Login> findById(Long id) {
		 return loginRepository.findById(id);
	 }
	 public void saveLogin(Login login) {
		 loginRepository.save(login);
	 }
}
