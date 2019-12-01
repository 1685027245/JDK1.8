package com.zy.ioFlow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest {
	
	public static void main(String[] args) {
		/**
		 * 输入流  读取文件
		 * 可以通过File来创建文件对象
		 */
		File filePath = new File("D:/java/text.txt");
		FileInputStreamReadFile("D:/java/text.txt");
	}
	
	/**
	 * 读取文件的内容  一次性全读
	 * @param filepath
	 */
	private static void FileInputStreamReadFile(String filepath)
    {
        try
        {
            File file = new File(filepath);
            FileInputStream fis = new FileInputStream(file);
            
            long filelength = file.length();
            byte[] bb = new byte[(int)filelength];
            
            fis.read(bb);
            fis.close();
            System.out.println(new String(bb));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
