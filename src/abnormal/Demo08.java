package abnormal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * �쳣���ࣺ
 * 	�쳣�֣� �ɲ��쳣������ʱ�쳣�ʹ���3�� 
 * 	���У�����ʱ�쳣�ʹ����ֽзǿɲ��쳣
 * @author Administrator
 *
 */
public class Demo08 {
	/**
	 * 1���ɲ��쳣
	 */
	//�ɲ��쳣�� CheckedException
	//�ɲ��쳣��������д������쳣��Ҫôtry catchס,Ҫô�����ף�˭���ã�˭���������� FileNotFoundException
	//��������������������Ͳ�����ͨ��
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
	}
}