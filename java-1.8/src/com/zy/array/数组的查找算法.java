package com.zy.array;

public class 数组的查找算法 {
	public static void main(String[] args) {
		int[] arr = new int[]{5,6,59,10,9,4,8,1};
//		线性查找     查找第一个目标元素所在的位置，没有则返回-1
		int target = 10;//查找的内容是10
		int index = -1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				index = i;
				break;
			}
		}
		System.out.println("目标"+target+"的下标是"+index);
//		二分查找	数组有序的情况下可以使用
		
		int[] arr2 = new int[]{10,20,30,50,70,80};
		int target2 = 70;
		int begin = 0;
		int end = arr2.length-1;
		int mid = (begin+end)/2;
		int index2 = -1;
		while(true){
			
			if(arr2[mid]==target2){
				index2 = mid;
				break;
			}else{
				if(arr2[mid]>target2){
					end = mid-1;
				}else{
					begin = mid+1;
				}
				mid = (begin+end)/2;
			}
			if(begin>end){
				break;
			}
		}
		System.out.println("目标"+target2+"的下标是"+index2);
	}
}
