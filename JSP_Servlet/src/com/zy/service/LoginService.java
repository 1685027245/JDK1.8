package com.zy.service;

import com.zy.pojo.User;

public interface LoginService {
	/**
	 * 登录校验
	 * @param user
	 * @return
	 */
	public User loginCheck(User user);
}
