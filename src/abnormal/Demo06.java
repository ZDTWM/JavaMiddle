package abnormal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * �쳣����
 * 	�����Ƿ�����쳣��finally�еĴ��붼�ᱻִ��
 * @author Administrator
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		File f = new File("d:/LOL.exe");
		try {
			System.out.println("��ͼ�� d:/LOL.exe");
			new FileInputStream(f);
			System.out.println("�ɹ���");
		} catch (FileNotFoundException e) {
			System.out.println("d:/LOL.exe������");
			e.printStackTrace();
		}
		finally{
			System.out.println("�����ļ��Ƿ���ڣ� ����ִ�еĴ���");
		}
	}
}
