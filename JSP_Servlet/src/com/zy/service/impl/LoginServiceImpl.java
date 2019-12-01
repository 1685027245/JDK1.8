package com.zy.service.impl;

import javax.jws.WebService;

import com.zy.dao.Dao;
import com.zy.pojo.User;
import com.zy.service.LoginService;

public class LoginServiceImpl implements LoginService {

	Dao dao = new Dao();
	@Override
	public User loginCheck(User user) {
		System.out.println("service:user:"+user.toString());
		return dao.loginCheck(user);
	}
}
