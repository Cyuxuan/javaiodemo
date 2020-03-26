package com.cyuxuan.javaiodemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *1、 图片读取到字节数组
 *2、 字节数组写出到文件
 *  @author Cyuxuan
 *
 *
 *流程：
 *		1.使用File创建文件对象
 *		2.创建文件输入流实例FileInputStream，读入数据
 *		3.写出数据，初始化ByteArrayOutputStream实例，写出数据为字符数组
 *		
 *
 *
 */
public class IOTest09 {

	public static void main(String[] args) {
		//图片转成字节数组
		byte[] datas = fileToByteArray("source/test.jpg");//把图片读为字节数组
		System.out.println(datas.length);
		byteArrayToFile(datas,"source/test-byte.jpg");//把字节数组写出		
	}
	/**
	 * 1、图片读取到字节数组
	 * 1)、图片到程序  FileInputStream
	 * 2)、程序到字节数组	ByteArrayOutputStream
	 */
	public static byte[] fileToByteArray(String filePath) {
		//1、创建源与目的地
		File src = new File(filePath);
		byte[] dest =null;
		//2、选择流
		InputStream  is =null;
		ByteArrayOutputStream baos =null;
		try {
			is =new FileInputStream(src);
			baos = new ByteArrayOutputStream();
			//3、操作 (分段读取)
			byte[] flush = new byte[1024*10]; //缓冲容器
			int len = -1; //接收长度
			while((len=is.read(flush))!=-1) {
				baos.write(flush,0,len);		 //写出到字节数组中，此时只是在缓冲区			
			}		
			baos.flush();//推出
			return baos.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//4、释放资源
			try {
				if(null!=is) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;		
	}
	
	
	
	/**
	 * 2、字节数组写出到图片
	 * 1)、字节数组到程序 ByteArrayInputStream
	 * 2)、程序到文件 FileOutputStream
	 */
	public static void byteArrayToFile(byte[] src,String filePath) {
		//1、创建源
		File dest = new File(filePath);
		//2、选择流
		InputStream  is =null;
		OutputStream os =null;
		try {
			is =new ByteArrayInputStream(src);//此实例将数组转换为字节值读入
			os = new FileOutputStream(dest);
			//3、操作 (分段读取)
			byte[] flush = new byte[5]; //缓冲容器
			int len = -1; //接收长度
			while((len=is.read(flush))!=-1) {
				os.write(flush,0,len);			//写出到文件，此时只是在缓冲区	
			}		
			os.flush();//推出
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//4、释放资源
			try {
				if (null != os) {
					os.close();
				} 
			} catch (Exception e) {
			}
		}
	}
}
