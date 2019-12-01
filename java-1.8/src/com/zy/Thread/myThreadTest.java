package com.zy.Thread;

public class myThreadTest {
	/**
	 * 多线程的基本使用
	 * 1.编写类继承Thread
	 * 2.实现run()方法
	 * 3.启动线程   使用start()方法
	 */
	public static void main(String[] args) {
		//Thread测试
		myThread threadA = new myThread("线程A");
		myThread threadB = new myThread("线程B");
		myThread threadC = new myThread("线程C");
//		threadA.start();
//		threadB.start();
//		threadC.start();
		
		//Runnable测试
		new Thread(threadA).start();
		new Thread(threadB).start();
		new Thread(threadC).start();
	}
}
//继承Thread类
class myThread extends Thread{
	private String name;
	
	public myThread(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(name+"---"+i);
		}
	}
}
//实现Runnable
class myThread2 implements Runnable {
	private String name;
	
	public myThread2(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(name+"---"+i);
		}
	}
}