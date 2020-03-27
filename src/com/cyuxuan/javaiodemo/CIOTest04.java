package com.cyuxuan.javaiodemo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * 写出内容
 * @author Cyuxuan
 *
 */
public class CIOTest04 {

	public static void main(String[] args) throws IOException {
		//写出文件
		FileUtils.write(new File("source/rhappy.sxt"), "学习是一件伟大的事业\r\n","UTF-8");
		FileUtils.writeStringToFile(new File("source/happy.sxt"), "学习是一件辛苦的事业\r\n","UTF-8",true);
		FileUtils.writeByteArrayToFile(new File("source/happy.sxt"), "学习是一件幸福的事业\r\n".getBytes("UTF-8"),true);

		//写出列表
		List<String> datas =new ArrayList<String>();
		datas.add("悟空");
		datas.add("悟能");
		datas.add("悟净");

		FileUtils.writeLines(new File("source/happy.sxt"), datas,"。。。。。",true);
	}

}
