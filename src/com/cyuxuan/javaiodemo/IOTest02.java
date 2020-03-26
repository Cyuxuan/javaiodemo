package com.cyuxuan.javaiodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 第一个程序:理解操作步骤  标准
 * 1、创建源
 * 2、选择流
 * 3、操作
 * 4、释放资源
 * 
 * @author Cyuxuan
 *
 */
public class IOTest02 {

	public static void main(String[] args) {
		//1、创建源
		File src = new File("source/text.txt");
		//2、选择流
		InputStream  is =null;
		try {
			is =new FileInputStream(src);//初始化一个输出流对象
			//3、操作 (读取)
			int temp ;
			while((temp=is.read())!=-1) {
				System.out.println((char)temp);
			}		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//4、释放资源,有可能关闭失败所以需要异常机制
			try {
				if(null!=is) {//is == null 说明文件打开失败，流未成功创建，不需要关闭
					//  System.out.println("现在需要关闭流");
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
