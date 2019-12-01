package com.zy.array;

import com.zy.myArray.myStack;

public class 栈 {
	public static void main(String[] args) {
		myStack stack = new myStack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		stack.show();
		System.out.println(stack.getStack());
		stack.show();
		System.out.println(stack.showTopStack());
		
		stack.getStack();
		stack.getStack();
		System.out.println(stack.isEmpty());
		stack.show();
	}
}
