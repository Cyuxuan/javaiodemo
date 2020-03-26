package com.cyuxuan.javaiodemo;

import java.io.File;


/**
 * @author Cyuxuan
 *
 */
public class FileDemo01 {

	public static void main(String[] args) {
		String path ="G:/myTools/eclipse/workspace/javaiodemo/source/test_source.jpg";

		//1、构建File对象
		File src = new File(path);
		System.out.println(src.length());

		//2、构建File对象
		src = new File("G:/myTools/eclipse/workspace/javaiodemo/source","test_source.jpg");
		System.out.println(src.length());

		//3、构建File对象
		src = new File(new File("G:/myTools/eclipse/workspace/javaiodemo/source"),"test_source.jpg");
		System.out.println(src.length());
	}

}
