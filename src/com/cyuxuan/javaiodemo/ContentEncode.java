package com.cyuxuan.javaiodemo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Cyuxuan
 * 
 * 编码: 字符串-->字节
 *
 */
public class ContentEncode {

	public static void main(String[] args) throws IOException {
		
		
		String msg ="生命的长度";
		
		
		//编码: 字节数组
		byte[] datas = msg.getBytes();  //默认使用工程的字符集
		System.out.println(datas.length);

		
		//编码: 其他字符集
		datas = msg.getBytes("UTF-16LE");
		System.out.println(datas.length);

		
		datas = msg.getBytes("GBK");
		System.out.println(datas.length);

	}

}
