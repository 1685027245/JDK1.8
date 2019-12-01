package com.zy.array;

import java.util.Arrays;

public class 数组的转置 {
	//转置：将数组倒序输出
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
		changeStartEnd(arr);
		System.out.println(Arrays.toString(arr));
		
 	}
	public static void changeStartEnd(int arr[]){
		int temp;
		for(int i=0;i<arr.length/2;i++){
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}
}
