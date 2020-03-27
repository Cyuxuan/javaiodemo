package com.cyuxuan.javaiodemo;

import java.io.File;

import org.apache.commons.io.FileUtils;

/**
 * 大小
 * @author Cyuxuan
 *
 */
public class CIOTest01 {

	public static void main(String[] args) {
		//文件大小
		long len =FileUtils.sizeOf(new File("src/com/cyuxuan/javaiodemo/CIOTest01.java"));
		System.out.println(len);
		//目录大小
		len = FileUtils.sizeOf(new File("source/test.jpg"));
		System.out.println(len);
	}

}
