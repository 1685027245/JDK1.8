package com.zy.myArray;

public class doubleNode {
//	双链表：既有记录上一个节点，又有记录下一个节点,也是循环链表
	
	int data;//节点数据
	doubleNode pre = this;//上一个节点
	doubleNode next = this;//下一个节点
	
	public doubleNode(int data){
		this.data = data;
	}
	
	//新增节点
	public void insertDoubleNode(doubleNode node){
		//当前节点
		doubleNode currentNode = this;
		//将下一个节点作为下下个节点
		doubleNode nextNode = this.next;
		
		currentNode.next = node;
		node.pre = currentNode;
		
		node.next = nextNode;
		nextNode.pre = node;
	}
	
//	获取上一个节点
	public doubleNode pre(){
		return this.pre;
	}
	
//	获取下一个节点
	public doubleNode next(){
		return this.next;
	}
	
//	获取节点的数据
	public int getData(){
		return this.data;
	}
}
