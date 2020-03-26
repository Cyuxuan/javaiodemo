package com.cyuxuan.javaiodemo;

import java.io.File;


/**
 * @author Cyuxuan
 *
 *	 * 构建File对象
	 * 相对路径与绝对路径
	 * 1)、存在盘符: 绝对路径
	 * 2)、不存在盘符:相对路径  ,当前目录 user.dir
	 * @param args
 */
public class FileDemo02 {

	
	public static void main(String[] args) {
		String path ="G:/myTools/eclipse/workspace/javaiodemo/source/test_source.jpg";

		//绝对路径
		File src = new File(path);
		System.out.println("获取文件的绝对路径---"+src.getAbsolutePath());

		//相对路径
		System.out.println("当前目录---"+System.getProperty("user.dir"));
		src = new File("source/test_source.jpg");
		System.out.println("当前目录绝对路径---"+src.getAbsolutePath());


		//构建一个不存在的文件
		src = new File("test_source2.jpg");
		System.out.println("不存在的文件的绝对路径---"+src.getAbsolutePath());//虽然该文件是不存在的，但是File实例还是能返回相应的路径
	}

}
