package com.zy.lang包;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;

import com.alibaba.fastjson.JSON;

public class Test {
	
	public static void main(String[] args) throws InterruptedException, ParseException {
		
//	    String endStr = "1995-12-31 23:59:59";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		
//		Date parse = sdf.parse(endStr);
//		System.out.println(parse);
//		
//		String format = sdf.format(parse);
//		System.out.println(format);
//		
//		 //采用单例模式获取日历对象Calendar.getInstance();
//        Calendar c = Calendar.getInstance();
//        Date time = c.getTime();
//        System.out.println(c.getWeekYear());
//        
//        Random random = new Random();
//        int randomNumber1= random.nextInt(100);
//        System.out.println(randomNumber1);
//        
//        Random random1 = new Random(100);
//        for(int i = 0; i < 10; i++){
//        	System.out.print(random1.nextInt(10) + " ");
//        }
        
		//提供了向量类(Vector)以实现类似动态数组的功能
//        Vector<String> hs = new Vector<String>();
//        hs.add("aa");
//        hs.add("bb");
//        hs.add("aa");
//        hs.add("cc");
//        hs.add("aa");
//        hs.add("dd");
//        
//        System.out.println("====>"+hs.get(3));
//        Enumeration<String> elements = hs.elements();
//        while (elements.hasMoreElements()) {
//            System.out.println(elements.nextElement());
//        }
		
		Hashtable<String, Integer> numbers = new Hashtable<String, Integer>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.put("five", 5);

        Integer n = numbers.get("two");
        Integer nn = numbers.get("six");
        
        if(n != null)
            System.out.println(n);
        System.out.println(nn);
		
	}
}	
