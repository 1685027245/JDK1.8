package com.zy.test;

import java.util.Calendar;

public class Test {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH )+1;
		String nowTime = year+"-"+month;
		System.out.println(nowTime);
	}
	
	
}
