package com.zy.ioFlow;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class WriterAndReader {
	public static void main(String[] args) throws IOException {
		//字符流
		//1.创建文件对象
		File f = new File("D:"+File.separator+"demo"+File.separator+"test2.txt");
		//判断文件夹是否存在
		if(!f.getParentFile().exists()){
			f.getParentFile().createNewFile();//创建文件夹
		}
		//2.创建字符流对象
		Writer w = new FileWriter(f);
		
		//3.输出（写入）数据
		String str = "这是通过Writer写入";
		w.write(str); //可以直接写入字符串
		//4.关闭流
		w.close();

		if(f.exists()){
			Reader r = new FileReader(f);
			//返回的是字符类型
			char data[] = new char[1024];
			//获取的是字符的长度
			int len = r.read(data);
			//直接使用字符串接受即可
			System.out.println(new String(data,0,len));
		}

	}
}
