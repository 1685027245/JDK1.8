package com.zy.myArray;

import java.util.Arrays;

public class myQueue {
//	入队
//	出队
//	判断队列是否为空
	
	int[] queue = null;
	public myQueue(){
		queue = new int[0]; //队列：先进先出
	}
	//入队
	public void add(int element){
		int[] newQueue = new int[queue.length+1];
		for(int i=0;i<queue.length;i++){
			newQueue[i] = queue[i];
		}
		newQueue[queue.length] = element;
		queue = newQueue;
	}
	
	public void show(){
		System.out.println(Arrays.toString(queue));
	}
	
//	出队
	public int getQueue(){
		int element = queue[0];
		int[] newQueue = new int[queue.length-1];

		for(int i=0;i<newQueue.length;i++){
			newQueue[i] = queue[i+1];
		}
		queue = newQueue;
		return element;
	}
	
//	判断队列是否为空
	public boolean isEmpty(){
		return queue.length==0?true:false;
	}
}
