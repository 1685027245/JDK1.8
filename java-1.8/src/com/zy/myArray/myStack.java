package com.zy.myArray;

import java.util.Arrays;

public class myStack {
//	创建一个栈
//	向栈中压入一个元素
//	取出栈顶元素
//	查看栈顶元素
//	判断栈是否为空
	
	int[] stack = null;
	public myStack(){
//		创建一个栈
		stack = new int[0]; //使用数组来表示栈，栈就是一个数组，只是需要先进后出
	}
	
//	向栈中压入一个元素
	public void push(int element){
		int[] newStack = new int[stack.length+1];
		for(int i=0;i<stack.length;i++){
			newStack[i] = stack[i];
		}
		newStack[stack.length] = element;
		stack = newStack;
	}
	
	//显示所有的元素
	public void show(){
		System.out.println(Arrays.toString(stack));
	}
	
//	取出栈顶元素
	public int getStack(){
		//取出栈顶元素
		int element = stack[stack.length-1];
		int[] newStack = new int[stack.length-1];
		//复制其他非栈顶元素
		for(int i=0;i<newStack.length;i++){
			newStack[i] = stack[i];
		}
		stack = newStack;
		return element;
	}
	
//	查看栈顶元素
	public int showTopStack(){
		return stack[stack.length-1];
	}
	
//	判断栈是否为空
	public boolean isEmpty(){
		return stack.length==0?true:false;
	}
}
