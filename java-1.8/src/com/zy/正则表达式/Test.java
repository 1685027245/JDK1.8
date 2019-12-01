package com.zy.正则表达式;

import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {

		/**
		 * 表达式 .* 就是单个字符匹配任意次，即贪婪匹配。 
		 * 表达式 .*? 是满足条件的情况只匹配一次，即最小匹配.
		 */
		String content = "I am noob " + "from runoob.com.";
		String pattern = ".*runoob.*";
		boolean isMatch = Pattern.matches(pattern, content);
		System.out.println("字符串中是否包含了 'runoob' 子字符串? " + isMatch);

	}

}
