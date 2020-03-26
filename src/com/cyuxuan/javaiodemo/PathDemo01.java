package com.cyuxuan.javaiodemo;

import java.io.File;


/**
 * @author Cyuxuan
 * 
 *  \  /  名称分隔符  separator
 * @param args
 */


public class PathDemo01 {

	
	
	public static void main(String[] args) {
		String path ="G:\\myTools\\eclipse\\workspace\\javaiodemo\\source\\test.jpg";
		
		System.out.println(File.separatorChar);
		//建议
		//1、/
		path = "G:/myTools/eclipse/workspace/javaiodemo/source/test.jpg";
		System.out.println(path);
		//2、常量拼接
		path ="G:"+File.separator+"myTools"+File.separator+"eclipse"+File.separator+"workspace"+
					File.separator+"javaiodemo"+File.separator+"source"+File.separator+"test.jpg";
		System.out.println(path);
		

	}

}
