package com.gibran.stockWallet.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gibran.stockWallet.entity.User;
import com.gibran.stockWallet.service.UserService;

@RestController
public class StockWalletController {
	
	@Autowired
	private UserService service;

	@GetMapping("test")
	public String test() {
		return "that is ok";
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return service.saveUser(user);
	}
//	add user
	@PostMapping("/users")
	public List<User> addUser(@RequestBody List<User>user){
		return service.saveUser(user);
	}
	
//	search id
	@PostMapping("/userById/{id}")
	public User findUserById(@PathVariable int id) {
		return service.getUserById(id);
	}
	
//	search name
	@PostMapping("/userByName/{name}")
	public User findUserByName(@PathVariable String name) {
		return service.getUserByName(name);
	}
	
//	update
	@PutMapping("/userUpdate")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
	
//	delete
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}
	
}
