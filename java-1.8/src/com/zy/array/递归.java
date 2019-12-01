package com.zy.array;

public class 递归 {
	
	//递归调用
	public static void main(String[] args) {
		print(10);
	}
	
	public static void print(int i){
		System.out.println(i);
		i = i-1;
		if(i>0){
			print(i);
		}
	}
}
