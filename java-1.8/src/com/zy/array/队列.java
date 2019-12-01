package com.zy.array;

import com.zy.myArray.myQueue;

public class 队列 {
	public static void main(String[] args) {
		myQueue queue = new myQueue();
		
		queue.add(10);
		queue.add(15);
		queue.add(20);
		queue.add(25);
		
		queue.show();
			
		System.out.println(queue.getQueue());
		queue.show();
		System.out.println(queue.isEmpty());
	}
}
