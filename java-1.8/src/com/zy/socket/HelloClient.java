package com.zy.socket;

import java.net.Socket;
import java.util.Scanner;

public class HelloClient {
	public static void main(String[] args) throws Exception{
		Socket client = new Socket("localhost",9999);
		//取得客户端的输入数据流对象，表示接收服务器端的输出信息
		Scanner scan = new Scanner(client.getInputStream());
		
		scan.useDelimiter("\n");//换行
		
		if(scan.hasNext()){
			System.out.println("返回数据"+scan.next());
		}
		scan.close();
		client.close();
	}
}
