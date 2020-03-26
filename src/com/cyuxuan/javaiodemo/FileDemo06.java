package com.cyuxuan.javaiodemo;

import java.io.File;
import java.io.IOException;

/**
 * 
 * @author Cyuxuan
 * 
 * 其他信息:
 * createNewFile()  : 不存在才创建，存在创建成功
 * delete():删除已经存在的文件
*
 *
 *
 */
public class FileDemo06 {
	public static void main(String[] args) throws IOException {
		File src = new File("G:/myTools/eclipse/workspace/javaiodemo/source/io.txt");
		boolean flag =src.createNewFile();
		System.out.println(flag);
		flag = src.delete();
		System.out.println(flag);

		System.out.println("----------");
		
		src = new File("G:/myTools/eclipse/workspace/javaiodemo/source2");//此处的source2不会被当作文件夹，而是没有后缀的文件
		flag =src.createNewFile();
		System.out.println(flag);

		flag = src.delete();
		System.out.println(flag);


		//补充:  con com3... 操作系统的设备名，不能正确创建
		src = new File("G:/myTools/eclipse/workspace/javaiodemo/source/com");
		flag = src.createNewFile();
		System.out.println(flag);
	}
}
