package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用字符流把字符串写入到文件
 * @author Administrator
 * FileWriter 是Writer的子类，以FileWriter 为例把字符串写入到文件
 */
public class Demo14 {

	public static void main(String[] args) {
		 // 准备文件lol2.txt
		File f = new File("d:/lol2.txt");
		// 创建基于文件的Writer
		try(FileWriter fr = new FileWriter(f);) {
			// 以字符流的形式把数据写入到文件中
			String data = "abcdefg1234567890";
			//将字符串拆分成字符数组
			char[] cs = data.toCharArray();
			
			fr.write(cs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
