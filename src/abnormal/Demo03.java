package abnormal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * �쳣����
 * @author Administrator
 *
 */
public class Demo03 {
	/**
	 * 2��ʹ���쳣����ĸ������catch
	 * 	FileNotFoundException��Exception�����࣬
	 * 	ʹ��ExceptionҲ����catchסFileNotFoundException
	 */
	public static void main(String[] args) {
		File f = new File("d:/LOL.exe");
		try {
			System.out.println("��ͼ�� d:/LOL.exe");
			new FileInputStream(f);
			System.out.println("�ɹ���");
		} catch (Exception e) {
			System.out.println("d:/LOL.exe������");
			e.printStackTrace();
		}
	}
	
}
