package com.AutoNavCom.AutoNavCom.queries;

public class UserQueries {

	public static String createUser = "insert into user_dtl (User_Id,User_Name,MobileNo,emailId)\r\n"
			+ "values (:userId,:userName,:MobileNo,:EmailId)";

}
