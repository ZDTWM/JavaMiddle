package abnormal;

import java.io.File;
import java.io.FileInputStream;

/**
 * ʲô���쳣��
 * @author Administrator
 * �쳣���壺 ���³�����������̱��жϵ��¼��������쳣
 */
public class Demo01 {
	/**
	 * 1���ļ��������쳣
	 */
	//����Ҫ��d�̵�LOL.exe�ļ�������ļ����п��ܲ����ڵ� 
	//Java��ͨ�� new FileInputStream(f) ��ͼ��ĳ�ļ������п����׳��ļ��������쳣FileNotFoundException 
	//�����������쳣���ͻ��б������ 
	public static void main(String[] args) {
		File f = new File("d:/LOL.exe");
		//��ͼ���ļ�LOL.exe�����׳�FileNotFoundException�������������쳣���ͻ��б������
		//new FileInputStream(f);
		
	}
	
	/**
	 * 2�������쳣
	 */
	//ParseException �����쳣�������ַ���ת��Ϊ���ڶ����ʱ���п����׳����쳣
	//OutOfIndexException �����±�Խ���쳣
	//OutOfMemoryError �ڴ治��
	//ClassCastException ����ת���쳣
	//ArithmaticException ����Ϊ��
	//NullPointerException ��ָ���쳣
}
