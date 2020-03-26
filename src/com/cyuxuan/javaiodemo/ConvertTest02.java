package com.cyuxuan.javaiodemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

/**
 * 转换流: InputStreamReader OutputStreamWriter
 * 1、以字符流的形式操作字节流（纯文本的）
 * 2、指定字符集
 * @author Cyuxuan
 *
 */
public class ConvertTest02 {
	
	
	public static void main(String[] args) {
		test1(); 
	}
	
	
	
	public static void test0() {
		try(BufferedReader reader =
				new BufferedReader(
						new InputStreamReader(
								new URL("http://www.baidu.com").openStream(),"UTF-8"));//打开一个网络流，打开为BufferedReader对象
				BufferedWriter writer =
						new BufferedWriter(
								new OutputStreamWriter(
										new FileOutputStream("source/baidu.html"),"UTF-8"));){//打开一个输出流，写出baidu.com源代码到文件
			//3、操作 (读取)
			String msg ;
			while((msg=reader.readLine())!=null) {
				//System.out.println(msg);
				writer.write(msg); //字符集不统一不够出现乱码
				writer.newLine();
			}					
			writer.flush();
		}catch(IOException e) {
			System.out.println("操作异常");
		}	
	}
	
	
	public static void test2() {
		//操作网络流  下载百度的源代码
		try(InputStreamReader is =
				new InputStreamReader(new URL("http://www.baidu.com").openStream(),"GBK");){
			//3、操作 (读取)
			int temp ;
			while((temp=is.read())!=-1) {
				System.out.print((char)temp);//字符不统一造成乱码,工程位UTF-8,读取时读取为GBK
			}		
			
		}catch(IOException e) {
			System.out.println("操作异常");
		}
	}
	
	
	/*
	 * InputStream得到的是字节流输入流，read以后得到字节流用于读取最高8位的ASCII和二进制数据的读取
	 * Reader读取的是字符流，Reader 用于读入16位字符，也就是Unicode 编码的字符；而 InputStream 用于读入 ASCII 字符和二进制数据。Reader支持16位的Unicode字符输出，
	 * InputStreamReader是字节流到字符流的桥梁
	 * 
	 */
	public static void test1() {
		//操作网络流  下载百度的源代码
		try(InputStream is =new URL("http://www.baidu.com").openStream();){
			//3、操作 (读取)
			int temp ;
			while((temp=is.read())!=-1) {
				System.out.print((char)temp); //字节数不够出现乱码
			}		
			
		}catch(IOException e) {
			System.out.println("操作异常");
		}
		
		
	}
}
