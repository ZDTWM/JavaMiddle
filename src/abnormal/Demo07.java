package abnormal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * throws
 * @author Administrator
 *
 */
public class Demo07 {
	
	private static void method2() throws FileNotFoundException{
		File f = new File("d:/LOL.exe");
		System.out.println("��ͼ�� d:/LOL.exe");
		new FileInputStream(f);
		System.out.println("�ɹ���");
	}
	
	private static void method1(){
		try {
			method2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�������������
	//����������method1
	//method1����method2
	//method2�д��ļ�

	//method2����Ҫ�����쳣����
	//����method2�����㴦�����ǰ�����쳣ͨ��throws�׳�ȥ
	//��ômethod1�ͻ�ӵ����쳣�� ����취Ҳ�����֣�Ҫô��try catch�������ҪôҲ���׳�ȥ��
	//method1ѡ�񱾵�try catchס һ��try catchס�ˣ����൱�ڰ�����쳣�������ˣ��������ڵ���method1��ʱ�򣬾Ͳ���Ҫ�����쳣������
	public static void main(String[] args) {
		method1();
	}

}
