package com.cyuxuan.javaiodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 四个步骤: 分段读取 文件字节输入流
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * 
 * @author Cyuxuan
 *
 */
public class IOTest03 {

	public static void main(String[] args) {
		//1、创建源
		File src = new File("source/text.txt");
		//2、选择流
		InputStream  is =null;
		try {
			is =new FileInputStream(src);//访问文件使用此实体类
			//3、操作 (分段读取)
			byte[] flush = new byte[1024*10]; //缓冲容器,10K
			int len = -1; //接收长度
			while((len=is.read(flush))!=-1) {//read函数传入缓冲区参数后，每次读取一个缓冲区的长度，并且返回读取的字符数量
				
				//字节数组-->字符串 (解码)
				String str = new String(flush,0,len);
				System.out.println(str);
			}		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//4、释放资源
			try {
				if(null!=is) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
