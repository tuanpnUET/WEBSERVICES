package com.itplus.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itplus.dao.UserDao;
import com.itplus.entity.User;
import com.itplus.model.UserDTO;
import com.itplus.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao userDao;
	@Override
	public List<UserDTO> getAll() {
		// TODO Auto-generated method stub
		List<UserDTO> listUserDTO = new ArrayList<UserDTO>();
		List<User> listUser = userDao.getAll();
		for (User user : listUser) {
			UserDTO userDTO = new UserDTO();
			userDTO.setName(user.getTen_kh());
			userDTO.setAge(user.getTuoi());
			listUserDTO.add(userDTO);
		}		
		return listUserDTO;
	}
	@Override
	public void addUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setTen_kh(userDTO.getName());
		user.setSo_dt(userDTO.getPhone());
		user.setTuoi(userDTO.getAge());
		userDao.addUser(user);		
	}

}
