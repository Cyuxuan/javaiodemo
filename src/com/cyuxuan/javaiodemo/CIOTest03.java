package com.cyuxuan.javaiodemo;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

/**
 * 读取内容
 * @author Cyuxuan
 *
 */
public class CIOTest03 {

	public static void main(String[] args) throws IOException {
		//读取文件
		String msg =FileUtils.readFileToString(new File("source/emp.txt"),"UTF-8");//读取文件为字符串
		System.out.println(msg);
		
		
		byte[] datas = FileUtils.readFileToByteArray(new File("source/emp.txt"));//读取文件为字节数组
		System.out.println(datas.length);
		
		System.out.println( );
		//逐行读取
		 List<String> msgs= FileUtils.readLines(new File("source/emp.txt"),"UTF-8");
		 for (String string : msgs) {
			System.out.println(string);
		}
		 
		 
		LineIterator it =FileUtils.lineIterator(new File("source/emp.txt"),"UTF-8");
		while(it.hasNext()) {
			System.out.println(it.nextLine());
		}
		
	}

}
