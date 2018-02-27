package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * 什么是流
 * @author Administrator
 *
 */
/**
 * 1、什么是流
 * @author Administrator
 *
 */
//当不同的介质之间有数据交互的时候，JAVA就使用流来实现。 
//数据源可以是文件，还可以是数据库，网络甚至是其他的程序 
//比如读取文件的数据到程序中，站在程序的角度来看，就叫做输入流 
//输入流： InputStream 
//输出流：OutputStream
public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 2、文件输入流
		 */
		try {
			File f = new File("d:/lol.txt");
			//创建基于文件的输入流
			FileInputStream fis = new FileInputStream(f);
			// 通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟中来，也就是读取到内存中
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		/**
		 * 3、输出流
		 */
		try {
			File f2 = new File("d:/dota.txt");
			// 创建基于文件的输出流
			FileOutputStream fos = new FileOutputStream(f2);
			// 通过这个输出流，就可以把数据从内存，输出到硬盘的文件上
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	
}
