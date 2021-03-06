package io;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

/**
 * 关闭流的方式
 * @author Administrator
 *
 */
public class Demo10 {
	/**
	 * 1、在 try中关闭：
	 * @param args
	 * 	在try的作用域里关闭文件输入流，在前面的示例中都是使用这种方式，这样做有一个弊端；
	 * 	如果文件不存在，或者读取的时候出现问题而抛出异常，那么就不会执行这一行关闭流的代码，存在巨大的资源占用隐患。 不推荐使用
	 */
	public static void main(String[] args) {
		
		try {
			File f = new File("d:/lol.txt");
			FileInputStream fis = new FileInputStream(f);
			byte[] all = new byte[(int) f.length()];
			fis.read(all);
			for(byte b : all){
				System.out.println(b);
			}
			//在try 里关闭流
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
