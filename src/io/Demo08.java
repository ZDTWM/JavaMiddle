package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ֽ���
 * @author Administrator
 *
 */
public class Demo08 {
	/**
	 * 2�����ֽ�������ʽ���ļ�д������
	 * 
	 */
	//OutputStream���ֽ��������ͬʱҲ�ǳ����ֻ࣬�ṩ�������������ṩ�����ľ���ʵ�֡�
	//FileOutputStream ��OutputStream���࣬��FileOutputStream Ϊ�����ļ�д������
	//ע: ����ļ�d:/lol2.txt�����ڣ�д���������Զ��������ļ��� 
	//����������ļ� d:/xyz/lol2.txt����Ŀ¼xyz�ֲ����ڣ����׳��쳣
	public static void main(String[] args) {

		try {
			// ׼���ļ�lol2.txt���е������ǿյ�
			File f = new File("d:/lol2.txt");
			// ׼��������2���ֽ����飬��88,89��ʼ�������Ӧ���ַ��ֱ���X,Y
			byte data[] = {88,89};
			// ���������ļ��������
			FileOutputStream fos = new FileOutputStream(f);
			// ������д�뵽�����
			fos.write(data);
			//�ر������
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
