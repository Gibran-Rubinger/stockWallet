package com.gibran.stockWallet.repository;

import java.rmi.server.UID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gibran.stockWallet.entity.User;

public interface UserRepository extends JpaRepository<User, UID> {

	User findByName(String name);

}
