package com.zy.myArray;

public class Node {
//	创建链表
//	为节点追回节点
//	获取下一个节点
//	获取节点的数据
//	删除单链表中的节点
//	往单链表中插入节点

	
	int data; //节点数据
	Node next = null; //下一个节点

	public Node(int data){
		this.data = data;  //给节点的data赋值
	}
	
//	创建链表：创建对象就创建了一个节点
	
//	为节点追回节点（将两个节点关联）
//	需要找到当前节点的最后一个连接节点，然后添加
	public void append(Node node){
		//当前节点
		Node currentNode = this;
		//循环找到最后一个节点
		while(true){
			//获取下一个节点
			Node nextNode = currentNode.next;
			//判断下一个节点是否为最后一个节点
			if(nextNode==null){
				break;
			}
			//否者将下一个节点赋给当前的next
			currentNode = nextNode;
		}
		//将添加的节点链接在最后
		currentNode.next = node;
	}
	
//	显示当前节点后面所有数据
	public void show(){
		Node currentNode = this;
		System.out.print(currentNode.data+" ");
		while(true){
			Node nextNode = currentNode.next;
			if(nextNode==null){
				break;
			}
			System.out.print(nextNode.data+" ");
			currentNode = nextNode;
		}
		System.out.println();
	}
	
//	获取下一个节点
	public Node next(){
		return this.next;
	}
	
//	获取节点的数据
	public int getData(){
		return this.data;
	}
//	删除单链表中的节点:删除当前节点的下一个节点
	public void delNode(){
		Node currentNode = this;
		//需要删除的下一个节点
		Node nextNextNode = currentNode.next;
		//将删除节点的next赋值给当前节点的next，则删除了下一个节点
		currentNode.next = nextNextNode.next;
	}
	
//	往单链表中插入节点
	public void insertNode(Node node){
		//取下一个节点当作下下个节点
		Node nextNode = this.next;
		this.next = node;
		node.next = nextNode;
	}
	
}
