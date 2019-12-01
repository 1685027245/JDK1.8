package com.zy.sort;

import java.util.Arrays;

public class 排序 {
	public static void main(String[] args) {
		int[] arr = new int[]{5,9,4,3,7,3,10,2};
		
		System.out.println(Arrays.toString(arr));
//		冒泡测试
		bubbleSort(arr);
		System.out.println("冒泡测试"+Arrays.toString(arr));
//		快速排序测试
		quickSort(arr,0,arr.length-1);
		System.out.println("快速排序测试"+Arrays.toString(arr));
//		直接插入排序测试
		insertSort(arr);
		System.out.println("直接插入排序测试"+Arrays.toString(arr));
		//简单选择排序测试
		selectSort(arr);
		System.out.println("简单选择排序测试"+Arrays.toString(arr));
	}
	
	/**
	 * 冒泡排序：从头开始往后两两相比，大的往后移
	 */
	public static void bubbleSort(int[] arr){
		int temp;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				//前后两个两两相比，大的移动后面
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	/**
	 * 快速排序：以第一个值为基准，比之小的在左边，比之大的在右边,递归调用，直到start=end
	 */
	public static void quickSort(int[] arr,int start,int end){
		if(start<end){
			int low = start;//开始位置
			int hight = end;//结束位置
			int stand = arr[start];//基准数

			while(low<hight){
				while(low<hight&&stand<=arr[hight]){
					hight--;
				}
				arr[low] = arr[hight];
				while(low<hight&&stand>=arr[low]){
					low++;
				}
				arr[hight] = arr[low];
			}
			arr[low] = stand;//将标准值取代重复数
			
			//递归调用
			quickSort(arr,start,low);//左边
			quickSort(arr,low+1,end);//右边
		}
	}
	
	/*
	 *直接插入排序 :从第二元素开始，一直和前面的比较，比之小就换位
	 */
	public static void insertSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			if(arr[i]<arr[i-1]){
				int temp = arr[i];
				int j;
				for(j=i-1;j>=0&&arr[j]>temp;j--){
					arr[j+1] = arr[j];
				}
				arr[j+1]=temp;
			}
		}
	}
	
	/*
	 *简单选择排序:取最小值的下标与之前的替换
	 */
	public static void selectSort(int[] arr){
		
		for(int i=0;i<arr.length;i++){
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[minIndex]){
					minIndex = j;
				}
			}
			if(i!=minIndex){
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
}
