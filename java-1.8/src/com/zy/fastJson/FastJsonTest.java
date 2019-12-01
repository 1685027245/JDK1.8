package com.zy.fastJson;

import com.alibaba.fastjson.JSON;
import com.zy.javabean.User;
import com.zy.javabean.UserAddress;
/**
 * fastJson的使用
 */
public class FastJsonTest {
	
	public static void main(String[] args) {
		User user = new User("01","张三","23",new UserAddress("广东","广州"));
		//fastJson序列化
		String jsonString = JSON.toJSONString(user);
		System.out.println(jsonString);
		//fastJson反序列化
		User parse = JSON.parseObject(jsonString,User.class);
		System.out.println(parse);
	}
}
