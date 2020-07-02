package com.gibran.stockWallet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockWalletController {

	@GetMapping("test")
	public String test() {
		return "that is ok";
	}
}
