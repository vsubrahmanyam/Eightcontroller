package com.sprhibmvc.tests.fixtures;

import java.util.Date;

import com.sphibmvc.entities.ScfUser;

public class ScfuserFixture
{
	
	public static ScfUser createScfUser()
	{
		ScfUser scfUser = new ScfUser();
		
		scfUser.setScfu_fname("Test Fname");
		scfUser.setScfu_lname("Test Lname");
		scfUser.setScfu_email("test@test.com");
		scfUser.setScfu_guid(Math.random()+"");
		scfUser.setScfu_last_update(new Date());
		scfUser.setScfu_login_time(new Date());
		scfUser.setScfu_password("pass123");
		scfUser.setScfu_create_date(new Date());
		scfUser.setScfu_subscription_id(1);
		
		return scfUser;
	}

}
