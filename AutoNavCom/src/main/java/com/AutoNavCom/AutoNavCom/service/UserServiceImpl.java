package com.AutoNavCom.AutoNavCom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AutoNavCom.AutoNavCom.model.User;
import com.AutoNavCom.AutoNavCom.repository.UserDao;

@Service
public class UserServiceImpl implements UserService {

	
	  @Autowired
	  private UserDao userDao;
	
	@Override
	public void createUser(User user) {
		
		userDao.insertUser(user);
		
	}


	
	
}
