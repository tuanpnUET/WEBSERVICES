package com.itplus.dao;

import java.util.List;

import com.itplus.entity.User;

public interface UserDao {
	List<User> getAll();
	void addUser(User user);
}
