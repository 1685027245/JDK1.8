package com.zy.array;

import com.zy.myArray.LoopNode;
import com.zy.myArray.doubleNode;

public class 双链表 {
//	双链表：既有记录上一个节点，又有记录下一个节点
	
	public static void main(String[] args) {
		doubleNode node1 = new doubleNode(1);
		doubleNode node2 = new doubleNode(2);
		doubleNode node3 = new doubleNode(3);
		
		node1.insertDoubleNode(node2);
		node1.insertDoubleNode(node3);
		//结果应为1--3--2
		
		System.out.println(node1.next().getData());
		System.out.println(node2.next().getData());
		System.out.println(node3.next().getData());
		System.out.println(node3.pre().getData());
	}
	

}
