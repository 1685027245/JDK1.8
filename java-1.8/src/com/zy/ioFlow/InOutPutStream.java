package com.zy.ioFlow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InOutPutStream {
	public static void main(String[] args) throws IOException {
		//字节流
		//1.创建文件对象及确定路径
		File f = new File("D:"+File.separator+"demo"+File.separator+"test.txt");
		
		//如果路径不存在
		if(!f.getParentFile().exists()){
			f.getParentFile().mkdir();//创建目录
		}
		
		//输出内容
		String str = "好好学习，天天向上！\r\n";//这里用\r\n换行
		//将字符串转为字节类型
		byte[] data = str.getBytes();
		
		//2.输出流:为文件对象创建输出流对象
		OutputStream output = new FileOutputStream(f); //该构造是覆盖内容
//		OutputStream output = new FileOutputStream(f,true);//该构造是追加内容
		
		//一个一个字节的输出
//		for(int i=0;i<data.length;i++){
//			output.write(data[i]);
//		}
		
		//3.全部一起输出:write也有两个构造方法，一个全部输出，另一个选择长度输出
		output.write(data);
		//4.资源操作一定要关闭
		output.close();
		
		//1.创建输入对象
		InputStream input = new FileInputStream(f);
		//判断文件是否存在
		if(f.exists()){
			int len = 0 ;
			byte[] bys = new byte[1024];
			//2.循环读取
			while ((len = input.read(bys)) != -1) {
			    System.out.println(new String(bys,0,len));
			}
			//3.关闭资源
			input.close();
		}else{
			System.out.println("文件不存在");
		}

	}
}
