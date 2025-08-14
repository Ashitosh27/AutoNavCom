package com.AutoNavCom.AutoNavCom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AutoNavCom.AutoNavCom.model.Component;
import com.AutoNavCom.AutoNavCom.model.User;
import com.AutoNavCom.AutoNavCom.repository.ComponentDao;
import com.AutoNavCom.AutoNavCom.repository.UserDao;

@Service
public class ComponentServiceImpl implements ComponetService {

	
	  @Autowired
	  private ComponentDao CompDao;

	  
	  
	@Override
	public boolean AddComponet(Component component) {
	
		return CompDao.addComponent(component);
	}
	



	
	
}
