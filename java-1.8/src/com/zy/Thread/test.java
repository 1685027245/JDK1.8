package com.zy.Thread;

public class test {
	public static void main(String[] args) {
//		int num = 10;
//		//这里中间经过若干步操作
//		//预期的结果为num为20，这就是断言
//		//java默认是不启动断言的，启用断言用  java -ea test断言
//		assert num == 20:"num不是20";
//		System.out.println("num="+num);
		
		int num = 20;
		try{
			if(num>10){
				throw new myException("数值过大");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}

class myException extends Exception{
	public myException(String msg){
		super(msg);
	}
}
