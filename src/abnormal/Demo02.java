package abnormal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * �쳣����
 * @author Administrator
 * �쳣�������ֶΣ� try catch finally throws
 */
public class Demo02 {
	public static void main(String[] args) {
		/**
		 * 1��try...catch
		 */
		File f = new File("d:/LOL.exe");
		try {
			System.out.println("��ͼ�� d:/LOL.exe");
			new FileInputStream(f);
			System.out.println("�ɹ���");
		} catch (FileNotFoundException e) {
			System.out.println("d:/LOL.exe������");
			e.printStackTrace();
		}
	}
}
