package com.gibran.stockWallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

//this is allow us to scan inside this package controllers/components.
@ComponentScan("com.gibran.stockWallet*")
public class StockWalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockWalletApplication.class, args);
	}

}
