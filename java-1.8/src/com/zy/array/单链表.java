package com.zy.array;

import com.zy.myArray.Node;

public class 单链表 {
	public static void main(String[] args) {
		//创建链表
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		
		node1.append(node2);
		node1.append(node3);
		node1.append(node4);
		
		node1.show();
		//获取下一个节点的数据
		System.out.println(node1.next().next().getData());
		
		node1.delNode();
		node1.show();
		
		Node node5 = new Node(50);
		node1.insertNode(node5);
		node1.show();
		
	}
}
