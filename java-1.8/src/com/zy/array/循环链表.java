package com.zy.array;

import com.zy.myArray.LoopNode;

public class 循环链表 {
	public static void main(String[] args) {
		
		LoopNode node1 = new LoopNode(1);
		LoopNode node2 = new LoopNode(2);
		LoopNode node3 = new LoopNode(3);
		LoopNode node4 = new LoopNode(4);
		
		node1.insertLoopNode(node2);
		node1.insertLoopNode(node3);
		node1.insertLoopNode(node4);
		
		System.out.println(node1.next().getData());
		System.out.println(node2.next().getData());
		System.out.println(node3.next().getData());
		System.out.println(node4.next().getData());
	}
}
