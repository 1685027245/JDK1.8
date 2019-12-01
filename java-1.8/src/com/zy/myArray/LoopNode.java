package com.zy.myArray;

public class LoopNode {
	//循环链表
	int data;//节点数据
	LoopNode next = this; //直接将下一个节点指向当前节点
	
	public LoopNode(int data){
		this.data = data;
	}
	
	//新增节点
	public void insertLoopNode(LoopNode node){
		LoopNode currentNode = this;
		LoopNode nextNode = this.next;
		currentNode.next = node;
		node.next = nextNode;
	}
	//获取下一个节点
	public LoopNode next(){
		return this.next;
	}
	//获取节点数据
	public int getData(){
		return this.data;
	}
	//删除当前节点的下一个节点
	public void delLoopNode(){
		//获取下一个节点作为下下个节点
		LoopNode nextNode = this.next;
		this.next = nextNode.next;
	}
	
}
