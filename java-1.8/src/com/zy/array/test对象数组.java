package com.zy.array;

import com.zy.myArray.myArray;

public class test对象数组 {
	public static void main(String[] args) {
		myArray arr = new myArray();
		
		System.out.println("数组的长度："+arr.length());
		
		arr.add(10);
		System.out.println("数组的长度："+arr.length());
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.show();
		
		arr.del(3);
		arr.show();
		
		System.out.println(arr.getIndexElement(0));
		
		arr.insert(2,50);
		arr.show();
		
		arr.update(0,5);
		arr.show();
		
		System.out.println(arr.sort(6));
		
		
		myArray arr2 = new myArray();
		arr2.add(10);
		arr2.add(20);
		arr2.add(30);
		arr2.add(40);
		arr2.add(50);
		arr2.add(60);
		System.out.println(arr2.rfSort(50));
	}
}
