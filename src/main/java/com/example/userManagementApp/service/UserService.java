package com.example.userManagementApp.service;

import java.util.List;

import com.example.userManagementApp.dto.User;

public interface UserService {

	List<User> getAllUsers();

	User getUser(String id);

	public void addUser(User user);

	User updateUser(User user);

	User deleteUser(String id);

}
