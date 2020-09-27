package com.ayushman.spring.springmvcorm.user.services.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ayushman.spring.springmvcorm.user.dao.UserDao;
import com.ayushman.spring.springmvcorm.user.entity.User;
import com.ayushman.spring.springmvcorm.user.services.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public int save(User user) {
		// business logic
		return userDao.create(user);
	}

	@Override
	public List<User> getUsers() {
		List<User> users = userDao.findUsers();
		Collections.sort(users);
		return users;
	}

	@Override
	public User getUser(Integer id) {
		return userDao.findUser(id);
	}
	
}
