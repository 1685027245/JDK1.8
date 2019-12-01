package com.zy.socket;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9999);//创建服务对象
		System.out.println("服务器已启动！");
		System.out.println("等待客户端连接....");
		
		Socket client = server.accept();//等待客户端连接
		//使用打印流负责输出
		PrintStream out = new PrintStream(client.getOutputStream());
		out.println("Hello,我是服务器...");
		out.close();
		client.close();
		server.close();
	}
}	
