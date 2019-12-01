package com.zy.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		
		 Date firstDate = new Date(0);
		 System.out.println("记录时间的开始时间是："+firstDate);
		  
		 Date now = new Date(); System.out.println("当前的时间是："+now);
		  /**
			* 时间now是不是在firstDate时间之后，是返回true 否则返回false util包中还有很多其他的方法 after()
			* before() getTime()等等
			*/
		
		 boolean a = now.after(firstDate);
		 System.out.println("时间now是不是在firstDate时间之后："+a);
		  
		 /**
			 * 三种方法来比较两个日期 1.通过getTime() 比较距离1970毫秒数
			 */
		
		 long time1 = firstDate.getTime(); long time2 = now.getTime();
		 System.out.println("相差毫秒数："+(time2-time1));
		  
		  //2.通过 before()，after() 和 equals() 
		 a = now.after(firstDate); 
		 boolean b = now.equals(firstDate); System.out.println("a:"+a+"\t"+"b:"+b);
		  
		  //3. 通过compareTo() 
		 int compareTo = now.compareTo(firstDate);
		 System.out.println("通过compareTo方法："+compareTo);
		  
		 /**
		  * 时间格式转换器
		  */
		
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
		 SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
		 System.out.println("时间格式转换："+simpleDateFormat.format(now));
		 System.out.println("时间格式转换："+simpleDateFormat2.format(now));
		  
		 /**
			 * 将字符串时间转为时间格式 simpleDateFormat2.parse(input) 需要使用指定的时间转换格式 这里使用
			 * simpleDateFormat("yyyy-MM-dd hh:mm:ss")就不行 因为时间格式只要有年月日
			 */
		
		  
		  String input = "2019-10-25"; try {
		  System.out.println("字符串转时间："+simpleDateFormat2.format(
		  simpleDateFormat2.parse(input))); } 
		  catch (ParseException e) { 
			  e.printStackTrace(); 
		 }
		  
		 /**
			 * 时间睡眠
			 */
		
		 try { 
			 	System.out.println("休眠之前："+simpleDateFormat.format(new
				Date())); Thread.sleep(1000*1); //休眠一秒
			    System.out.println("休眠之后："+simpleDateFormat.format(new Date())); }
		 catch (InterruptedException e) { 
			 	e.printStackTrace();
			 }
		  
		 /**
		   * 测量时间差 System.currentTimeMillis();获取系统当前时间
		  */
			  
		 try { 
			 long start = System.currentTimeMillis();
			 Thread.sleep(1000*3); //休眠三秒 
			 long stop = System.currentTimeMillis();
			 System.out.println("相差的时间是："+(stop-start)/1000+"秒"); } 
		 catch(InterruptedException e) { 
			 e.printStackTrace();
		 }
			 

		/**
		 * 获取时间指定的某个值 年 或 月 ...
		 */
		Calendar c2 = Calendar.getInstance(); // 默认是当前日期
		// c1.set(2009, 6 - 1, 12); //设置系统时间
		System.out.println(c2.getTime());  //获取当前时间
		System.out.println("c2：" + c2);

		Calendar c1 = Calendar.getInstance();
		// 获得年份
		int year = c1.get(Calendar.YEAR);
		// 获得月份
		int month = c1.get(Calendar.MONTH) + 1;
		// 获得日期
		int date = c1.get(Calendar.DATE);
		// 获得小时
		int hour = c1.get(Calendar.HOUR_OF_DAY);
		// 获得分钟
		int minute = c1.get(Calendar.MINUTE);
		// 获得秒
		int second = c1.get(Calendar.SECOND);
		// 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
		int day = c1.get(Calendar.DAY_OF_WEEK);
			
		System.out.println(year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒"+"周"+(day-1));

	}
}
