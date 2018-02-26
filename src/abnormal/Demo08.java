package abnormal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 异常分类：
 * 	异常分： 可查异常，运行时异常和错误3种 
 * 	其中，运行时异常和错误又叫非可查异常
 * @author Administrator
 *
 */
public class Demo08 {
	/**
	 * 1、可查异常
	 */
	//可查异常： CheckedException
	//可查异常即必须进行处理的异常，要么try catch住,要么往外抛，谁调用，谁处理，比如 FileNotFoundException
	//如果不处理，编译器，就不让你通过
	public static void main(String[] args) {
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
