package com.cyuxuan.javaiodemo;

import java.io.File;

/**
 * 
 * @author Cyuxuan
 * 
 * 其他信息
 * length() : 文件的字节数
*
 *
 *
 */
public class FileDemo05 {
	public static void main(String[] args) {
		File src = new File("G:/myTools/eclipse/workspace/javaiodemo/source/test.jpg");
		System.out.println("长度:"+ src.length());

		src = new File("G:/myTools/eclipse/workspace/javaiodemo/source");
		System.out.println("长度:"+ src.length());

		src = new File("G:/myTools/eclipse/workspace/javaiodemo/src");
		System.out.println("长度:"+ src.length());


	}
}
