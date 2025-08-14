package com.AutoNavCom.AutoNavCom.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.AutoNavCom.AutoNavCom.model.Component;
import com.AutoNavCom.AutoNavCom.model.User;
import com.AutoNavCom.AutoNavCom.queries.ComponentQueries;
import com.AutoNavCom.AutoNavCom.queries.UserQueries;

import lombok.extern.slf4j.Slf4j;

@Repository
public class ComponentDaoImpl implements ComponentDao {



	@Autowired
	private  NamedParameterJdbcTemplate npjt ;
	

	
	@Override
	public boolean addComponent(Component component) {
		
		Map<String, Object> params = new HashMap<>();
		params.put("ComponentId", component.getComponentId());
		params.put("ComponentName", component.getComponentName());
		
		int status = npjt.update(
			    ComponentQueries.addComponent,
			    params
			);
		
		if(status == 1)
			return true;
		
		
		return false;
	}
	
	
	
	
	
	

}
