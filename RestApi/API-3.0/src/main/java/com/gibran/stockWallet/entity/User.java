package com.gibran.stockWallet.entity;

import java.rmi.server.UID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="user")
public class User {
		@Id
		private UID id;
		private String userName = "";
		private String email = "";
		
		public User(String userName,String email) {
			this.userName = userName;
			this.email = email;
		}
		
		
		public UID getId() {
			return id;
		}
		public void setId(UID id) {
			this.id = id;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		
		
}
