package com.zy.ioFlow;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class myFile {
	public static void main(String[] args) throws IOException {
		//文件路径:在windows系统中支持"\"路径分隔符，而在Linux中使用的是"/"路径分隔符
		//为了解决这个问题File提供了一个自动获取分隔符：File.separator
		String path = "D:"+File.separator+"demo"+File.separator+"demo1"+File.separator+"demo1.txt";
		
		//创建文件对象,将其封装成file类对象，就可以调用file类的方法了
		File f = new File(path);
		
		//创建目录:如果目录不存在，创建目录
		if(!f.getParentFile().exists()){//获得父级目录
			//mkdir() 只能创建一级目录
			//mkdirs() 可以创建多级目录
			System.out.println(f.getParentFile());
			f.getParentFile().mkdirs();
		}
					
		if(f.exists()){//判断文件是否存在
			//删除文件
			f.delete();
		}else{
			//创建文件
			boolean s = f.createNewFile();
			System.out.println("创建结果："+s);
		}
		
		//获取文件的相关信息
		File fMsg = new File("D:"+File.separator+"demo"+File.separator+"demo1"+File.separator+"imss.jpg");
		
		System.out.println(fMsg.length());
		//将字节类型转为k,将文件大小转为double类型（文件获取的长度为long类型），再除以1024，再通过BigDecimal保留两位小数
		System.out.println("文件大小："+new BigDecimal((double)fMsg.length()/1024).divide(new BigDecimal(1),2,BigDecimal.ROUND_HALF_UP));
		
		//判断是否是文件
		System.out.println("是否是文件："+fMsg.isFile());
		//判断是否是目录
		System.out.println("是否是目录："+fMsg.isDirectory());
		//最近一次修改时间
		System.out.println("上一次修改时间："+fMsg.lastModified());
		//将时间转格式:先将获取的格式转为Date类型，再通过SimpleDateFormat转为日常格式
		System.out.println("上一次修改时间："+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(fMsg.lastModified())));
		
		
		//列出目录下所有子目录
		File All = new File("D:"+File.separator+"demo");
		File result[] = All.listFiles();
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}
}
