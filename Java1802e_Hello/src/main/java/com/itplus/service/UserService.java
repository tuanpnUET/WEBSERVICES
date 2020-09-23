package com.itplus.service;

import java.util.List;

import com.itplus.model.UserDTO;

public interface UserService {
	List<UserDTO> getAll();
	void addUser(UserDTO userDTO);
}
