package com.gibran.stockWallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gibran.stockWallet.service.UserService;

@RestController
public class StockWalletController {
	
	@Autowired
	private UserService service;

	@GetMapping("test")
	public String test() {
		return "that is ok";
	}
}
