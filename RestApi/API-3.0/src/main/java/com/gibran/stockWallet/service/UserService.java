package com.gibran.stockWallet.service;

import java.rmi.server.UID;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gibran.stockWallet.entity.User;
import com.gibran.stockWallet.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
//	post methods
	public User saveUser(User user) {
		return repository.save(user);
	}

//	all methods
	public List<User> saveUser(List<User> user){
		return repository.saveAll(user);
	}
	
//	 get methods
	public List<User> getUser(){
		return repository.findAll();
	}
	
//	all
	public User getUserById(UID id) {
		return repository.findById(id).orElse(null);
	}
	
//	by name
	public User getUserByName(String name) {
		return repository.findByName(name);
	}
	
//	to delete
	public String deleteUser(UID id) {
		return "The user"+id+"has been removed";
	}
	
//	to update
	public User updateUser(User user) {
//		User existingUser=repository.findById(user.getId()).orElse(null);
//		existingUser.setUserName(user.getUserName());
//		existingUser.setEmail(user.getEmail());
//		return repository.save(existingUser);
		return null;
	}
}
