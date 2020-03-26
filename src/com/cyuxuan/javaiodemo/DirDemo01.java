package com.cyuxuan.javaiodemo;

import java.io.File;

/**
 * 
 * @author Cyuxuan
 * 
 * 创建目录
 * 1、mkdir() : 确保上级目录存在，不存在创建失败
 * 2、mkdirs(): 上级目录可以不存在，不存在一同来创建
 *
 */
public class DirDemo01 {


	
	public static void main(String[] args) {
		File dir = new File("G:/myTools/eclipse/workspace/javaiodemo/source/test_source.jpg");
		//创建目录 mkdirs()
		boolean flag = dir.mkdirs();
		System.out.println(flag);
		//创建目录 mkdir()
		dir = new File("G:/myTools/eclipse/workspace/javaiodemo/source");
		flag = dir.mkdirs();
		System.out.println(flag);
	}
}
