package com.cyuxuan.javaiodemo;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author Cyuxuan
 *PrintStream和printWriter
 */
public class PrintTest {
	 public static void main(String[] args) throws FileNotFoundException {
		 
		 //打印流System.out
		 PrintStream ps = System.out;
		 ps.println("打印流");
		 ps.println(true);
		 
		 
		ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("source/print.txt")),true);//此处有强制刷新，true为打开
		ps.println("打印流");
		ps.println(true);
		ps.flush();//强制刷新
		
		
		//重定向输出端
		System.setOut(ps);
		System.out.println("change");
		
		
		//重定向回控制台
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out))));
		System.out.println("i am back");
		
		 
	}
}
