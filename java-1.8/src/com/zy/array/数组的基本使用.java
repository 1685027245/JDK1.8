package com.zy.array;

import java.util.Arrays;

public class 数组的基本使用 {
	//数组的基本使用
	public static void main(String[] args) {
		useArrays();
	}
	
	public static void useArrays(){
//		创建数组
		//
		int[] arr1 = new int[3];
		System.out.println(Arrays.toString(arr1)+"	length:"+arr1.length);
		
		int[] arr2 = new int[]{1,3,5,7,9};
		System.out.println(Arrays.toString(arr2)+"	length:"+arr2.length);
//		获取数组的长度
		System.out.println("length:"+arr2.length);
		
//		访问数组中的元素
		System.out.println(arr2[3]);
//		数组的赋值
		arr2[3] = 10;
		System.out.println(Arrays.toString(arr2));
//		遍历数组
		for(int i=0;i<arr2.length;i++){
			System.out.println(arr2[i]);
		}
//		向数组中添加元素
		//思路：创建一个新的数组，将元素的数值一个个复制过去，再添加元素，将新数组赋值给旧数组
		int[] newArr = new int[arr2.length+1];
		for (int i=0;i<arr2.length;i++) {
			newArr[i] = arr2[i];
		}
		newArr[arr2.length] = 15;//添加新元素15
		arr2 = newArr;
		System.out.println("添加元素后："+Arrays.toString(arr2));
		
//		删除数组中的元素
		//思路：创建一个新的数组，将不需要删除的元素一个个复制过去，将新数组赋值给旧数组
		int[] newArr2 = new int[arr2.length-1];
		//删除元素下标为2的元素
		int index = 2;
		for (int i=0;i<newArr2.length;i++){
			if(i<index){
				newArr2[i] = arr2[i];
			}else{
				newArr2[i] = arr2[i+1];
			}	
		}
		
		arr2 = newArr2;
		System.out.println("删除元素后："+Arrays.toString(arr2));
	}
	
	
	
}
