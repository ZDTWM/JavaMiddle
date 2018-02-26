package abnormal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常处理
 * @author Administrator
 *
 */
public class Demo03 {
	/**
	 * 2、使用异常处理的父类进行catch
	 * 	FileNotFoundException是Exception的子类，
	 * 	使用Exception也可以catch住FileNotFoundException
	 */
	public static void main(String[] args) {
		File f = new File("d:/LOL.exe");
		try {
			System.out.println("试图打开 d:/LOL.exe");
			new FileInputStream(f);
			System.out.println("成功打开");
		} catch (Exception e) {
			System.out.println("d:/LOL.exe不存在");
			e.printStackTrace();
		}
	}
	
}
