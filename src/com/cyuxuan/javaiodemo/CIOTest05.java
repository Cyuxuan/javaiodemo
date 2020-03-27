package com.cyuxuan.javaiodemo;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/**
 * 拷贝
 * @author Cyuxuan
 *
 */
public class CIOTest05 {

	public static void main(String[] args) throws IOException {
		//复制文件
		//FileUtils.copyFile(new File("source/test.jpg"),new File("test-copy.png"));
		
		//复制文件到目录
		//FileUtils.copyFileToDirectory(new File("source/test.jpg"),new File("source"));
		
		//复制目录到目录
		//FileUtils.copyDirectoryToDirectory(new File("source"),new File("source/dest"));
		
		//复制目录
		//FileUtils.copyDirectory(new File("source"),new File("source2"));
		
		//拷贝URL内容
		//String url = "https://pic2.zhimg.com/v2-7d01cab20858648cbf62333a7988e6d0_qhd.jpg";
		//FileUtils.copyURLToFile(new URL(url), new File("source/marvel.jpg"));
		
		
		String datas =IOUtils.toString(new URL("http://www.163.com"), "gbk");
		System.out.println(datas);
	}

}
