package com.zy.Thread;

public class myThreadTestRunnable {
	/**
	 * 多线程的基本使用
	 * 1.编写类实现Runnable接口
	 * 2.创建线程
	 * 3.启动线程
	 */
	public static void main(String[] args) {
		myThreadRunable threadA = new myThreadRunable("线程A");
		myThreadRunable threadB = new myThreadRunable("线程B");
		myThreadRunable threadC = new myThreadRunable("线程C");

		//Runnable测试
//		new Thread(threadA).start();
//		new Thread(threadB).start();
//		new Thread(threadC).start();
		
		//使用同一个线程对象，实现共享数据
		myThreadRunable threadD = new myThreadRunable("线程D");
		new Thread(threadD,"D_1").start();
		new Thread(threadD,"D_2").start();
		new Thread(threadD,"D_3").start();
		
		try{
			throw new Exception("这是自定义手动抛出异常");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

//实现Runnable
class myThreadRunable implements Runnable {
	private String name;
	private int s = 10;
	
	public myThreadRunable(String name){
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			this.sale();
		}
	}
	
	public synchronized void sale(){
		try{
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		if(s>0){
			System.out.println(name+"--"+Thread.currentThread().getName()+"--"+s--);
		}
	}
	
	public void send() throws Exception{
		System.out.println("显示结果");
	}
}