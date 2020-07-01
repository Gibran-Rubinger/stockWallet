package com.gibran.stockWallet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SotckWaletController {
	@GetMapping("test")
	public String test() {
		return "that is ok";
	}
}
