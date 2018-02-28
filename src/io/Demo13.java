package io;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

/**
 * 字符流：
 * 	Reader：字符输入流
 * 	Writer：字符输出流
 * 	专门用于字符的形式读取和写入数据
 */
public class Demo13 {

	public static void main(String[] args) {
		// 准备文件lol.txt其中的内容是AB
		File f = new File("d:/lol.txt");
		 // 创建基于文件的Reader
		try (FileReader fr = new FileReader(f);){
			// 创建字符数组，其长度就是文件的长度
			char[] all = new char[(int) f.length()];
			// 以字符流的形式读取文件所有内容
			fr.read(all);
			for(char b : all){
				// 打印出来是A B
				System.out.println(b);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
