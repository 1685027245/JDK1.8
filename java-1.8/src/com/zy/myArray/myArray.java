package com.zy.myArray;

import java.util.Arrays;

public class myArray {
//	创建可变的数组
//	获取长度
//	添加一个元素
//	显示所有元素
//	删除某个元素
//	取出指定位置的元素
//	向指定位置插入指定元素
//	替换指定位置的元素
	
	
	int[] arr = null; //定义数组
	//对象数组的使用
	public myArray(){
		//实例化数组
		arr = new int[0];
	}
	
	//返回数组的长度
	public int length(){
		return arr.length;
	}
	
	//添加一个元素
	public void add(int element){
		int[] newArr = new int[arr.length+1];
		for(int i=0;i<arr.length;i++){
			newArr[i] = arr[i];
		}
		newArr[arr.length] = element;
		arr = newArr;
	}
	
	//显示所有元素
	public void show(){
		System.out.println(Arrays.toString(arr));
	}
	
	//删除某个元素
	public void del(int index){
		if(index<0||index>=arr.length){
			throw new RuntimeException("下标超出范围");
		}else{
			int[] newArr = new int[arr.length-1];
			for (int i=0;i<newArr.length;i++){
				if(i<index){
					newArr[i] = arr[i];
				}else{
					newArr[i] = arr[i+1];
				}	
			}
			arr = newArr;
		}		
	}
	
//	取出指定位置的元素
	public int getIndexElement(int index){
		if(index<0||index>=arr.length){
			throw new RuntimeException("下标超出范围");
		}else{
			return arr[index];
		}
	}
	
//	向指定位置插入指定元素
	public void insert(int index,int element){
		int[] newArr = new int[arr.length+1];
		for(int i= 0;i<arr.length;i++){
			if(i<index){
				newArr[i] = arr[i];
			}else{
				newArr[i+1]= arr[i];
			}
		}
		newArr[index] = element;
		arr = newArr;
	}
	
//	替换指定位置的元素
	public void update(int index,int element){
		arr[index] = element;
	}
	
	//线性查找
	public int sort(int element){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==element){
				return i;
			}
		}
		return -1;
	}
	
	//二分查找
	public int rfSort(int element){
		int begin = 0;
		int end = arr.length-1;
		int mid = (begin+end)/2;
		
		while(true){
			if(arr[mid] == element){
				return mid;
			}else{
				if(arr[mid]>element){
					end = mid -1;
				}else{
					begin = mid+1;
				}
				mid = (begin+end)/2;
			}
			if(begin>end){
				return -1;
			}
		}
	}
}
