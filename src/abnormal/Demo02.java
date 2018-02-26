package abnormal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常处理
 * @author Administrator
 * 异常处理常见手段： try catch finally throws
 */
public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 1、try...catch
		 */
		File f = new File("d:/LOL.exe");
		try {
			System.out.println("试图打开 d:/LOL.exe");
			new FileInputStream(f);
			System.out.println("成功打开");
		} catch (FileNotFoundException e) {
			System.out.println("d:/LOL.exe不存在");
			e.printStackTrace();
		}
	}
}
