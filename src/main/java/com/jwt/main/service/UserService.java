package com.jwt.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jwt.main.models.User;

@Service
public class UserService {
	
	private List<User> store=new ArrayList<>();
	public UserService()
	{
		store.add(new User("1","sayan","sayan@123"));
		store.add(new User("2","subhajit","subhajit@123"));
		store.add(new User("3","ritwik","ritwik@123"));
	}
	public List<User> getUsers()
	{
		return this.store;
	}
}
