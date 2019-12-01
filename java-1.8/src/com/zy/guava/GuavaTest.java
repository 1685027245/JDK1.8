package com.zy.guava;

import com.google.common.base.Strings;

public class GuavaTest {
	
	public static void main(String[] args) {
		String user = null;
		String user2 = "";
		String user3 = "zs";
		System.out.println(Strings.isNullOrEmpty(user));
		System.out.println(Strings.isNullOrEmpty(user2));
		System.out.println(Strings.isNullOrEmpty(user3));
	}
}
