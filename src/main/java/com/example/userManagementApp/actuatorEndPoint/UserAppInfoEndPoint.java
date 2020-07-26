package com.example.userManagementApp.actuatorEndPoint;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "userAppInfo")
public class UserAppInfoEndPoint {
	
	
	@ReadOperation
	public UserAppInfo userAppInfo() {
		Map<String, Object> details = new LinkedHashMap<String, Object>();
		
		details.put("App Location", "!!Marrs!!");
		details.put("Status", "Reporting from Mars. All are Good!!");
		
		UserAppInfo health = new UserAppInfo();
		
		health.setHealthDetails(details);
		return health;		
	}
	
	@ReadOperation
	public String userAppEndPonintByName(@Selector String name) {
		return "This is user management application, reporting from Mars!! All OK : " + name;
	}
	
	@WriteOperation
	public void writeOperation(@Selector String name) {
		//perform write operation. This is for POST type endpoint.
	}
	
	@DeleteOperation
	public void deleteOperation(@Selector String name) {
		//perform delete operation. This is for delete type endpoint.
	}
	
	
	

}
