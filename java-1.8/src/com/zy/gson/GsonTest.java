package com.zy.gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zy.javabean.User;
import com.zy.javabean.UserAddress;

public class GsonTest {
	//Gson对象需要先实例化
	private final static Gson gson = new Gson();
	
	public static void main(String[] args) {
		javaBeanAndJson();
		ArrayOrListAndJson();
	}
	/**
	 * javaBean和Json直接的转换
	 * 包含了复杂的序列化和反序列化
	 * 序列化：将javaBean转为json
	 * 反序列化：将json转为javaBean
	 */
	public static void javaBeanAndJson() {
		User user = new User("01","张三","23",new UserAddress("广东","广州"));
		//将javabean转为json
		String toJson = gson.toJson(user);
		System.out.println(toJson);
		//将json转为javabean
		User fromJson = gson.fromJson(toJson, User.class);
		System.out.println(fromJson);
	}
	
	/**
	 * 将数组和字符进行序列化和反序列化
	 * 序列化：将javaBean转为json
	 * 反序列化：将json转为javaBean
	 */
	public static void ArrayOrListAndJson() {
		String namesJson = "['张三','李四','王五']";
		//将字符串转为String数组
		String[] nameArray = gson.fromJson(namesJson, String[].class);
		System.out.println(nameArray);
		//将String数组转为字符串
		String json = gson.toJson(nameArray);
		System.out.println(json);
		
		String userJson = "[{'id':'02','name':'小强','age':26},"
						+ "{'id':'03','name':'小李','age':27}]";
		//将String转为List
		Type userListType = new TypeToken<ArrayList<User>>(){}.getType();//获取类型
		List<User> userList = gson.fromJson(userJson, userListType); 
		System.out.println(userList);
		//将List转为String
		String json2 = gson.toJson(userList);
		System.out.println(json2);
	}
}
