package com.AutoNavCom.AutoNavCom.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.AutoNavCom.AutoNavCom.model.User;
import com.AutoNavCom.AutoNavCom.queries.UserQueries;

import lombok.extern.slf4j.Slf4j;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private  NamedParameterJdbcTemplate npjt ;
	
	
	@Override
	public void insertUser(User user) {
		
		
		Map<String, Object> params = new HashMap<>();
		params.put("userName",user.getUserName()); 
		params.put("userId",user.getUserId()); 
		params.put("MobileNo",user.getMobileNo()); 
		params.put("EmailId",user.getEmailId()); 
		npjt.update(
		    UserQueries.createUser,
		    params
		);
		
	}

}
