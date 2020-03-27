package com.cyuxuan.javaiodemo;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;

/**
 * 列出子孙级
 * @author Cyuxuan
 *
 */
public class CIOTest02 {

	public static void main(String[] args) {
		
		//使用容器存储获取到的目录，并且体验不同的过滤器
		Collection<File> files =FileUtils.listFiles(new File("G:\\myTools\\eclipse\\workspace\\javaiodemo"),
				EmptyFileFilter.NOT_EMPTY, null);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		
		
		System.out.println("---------------------");
		 files =FileUtils.listFiles(new File("G:\\myTools\\eclipse\\workspace\\javaiodemo"),
					EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		
		
		System.out.println("---------------------");
		 files =FileUtils.listFiles(new File("G:\\myTools\\eclipse\\workspace\\javaiodemo"),
					new SuffixFileFilter("java"), DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		System.out.println("---------------------");
		 files =FileUtils.listFiles(new File("G:\\myTools\\eclipse\\workspace\\javaiodemo"),
					FileFilterUtils.or(new SuffixFileFilter("java"),
							new SuffixFileFilter("class"),EmptyFileFilter.EMPTY), DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		
		System.out.println("---------------------");
		 files =FileUtils.listFiles(new File("G:\\myTools\\eclipse\\workspace\\javaiodemo"),
					FileFilterUtils.and(new SuffixFileFilter("java"),
							EmptyFileFilter.NOT_EMPTY), DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
	}

}
