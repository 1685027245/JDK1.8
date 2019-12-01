package com.zy.string;

public class myStringBuffer {
	public static void main(String[] args) {
		//StringBuffer的基本使用
		//创建StringBuffer对象
		StringBuffer str = new StringBuffer();
		//添加数据
		str.append("Hello").append(" World");
		System.out.println(str.toString());
		
		String name = "我是张三";
		StringBuffer nameBuffer = new StringBuffer();
		nameBuffer.append(name);
		System.out.println(nameBuffer);
		
		//反转
		nameBuffer.reverse();
		System.out.println(nameBuffer);
		
		//插入
		nameBuffer.insert(1,"kk");
		System.out.println(nameBuffer);
		
		//部分删除
		nameBuffer.delete(2,4);
		System.out.println(nameBuffer);
	}
}
