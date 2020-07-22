package com.gibran.stockWallet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gibran.stockWallet.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByName(String name);

}
