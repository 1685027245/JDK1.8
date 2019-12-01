package com.zy.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTestCallable {
	/**
	 * 多线程的基本使用
	 * 1.编写类实现Callable接口
	 * 2.创建线程
	 * 3.通过FutureTask启动线程
	 * 4.获取线程返回结果
	 * @throws ExecutionException  
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		myThreadCallable threadA = new myThreadCallable("线程A");
		myThreadCallable threadB = new myThreadCallable("线程B");

		//Callable测试
		FutureTask<String> task1 = new FutureTask<String>(threadA);
		FutureTask<String> task2 = new FutureTask<String>(threadB);
		//FutureTask是Runnable接口子类，所以可以使用Thread类的构造来接受task对象
		
		new Thread(task1).start();//启动多线程
		new Thread(task2).start();//启动多线程
		
		//取得线程返回对象
		System.out.println("返回task1结果："+task1.get());
		System.out.println("返回task2结果："+task2.get());
	}
}

//实现Runnable
class myThreadCallable implements Callable<String> {
	private String name;
	
	public myThreadCallable(String name){
		this.name = name;
	}
	
	@Override
	public String call() throws Exception {
		for(int i=0;i<10;i++){
			System.out.println(name+"---"+i);
		}
		return "执行完成";
	}
}