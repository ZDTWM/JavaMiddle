package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * ʲô����
 * @author Administrator
 *
 */
/**
 * 1��ʲô����
 * @author Administrator
 *
 */
//����ͬ�Ľ���֮�������ݽ�����ʱ��JAVA��ʹ������ʵ�֡� 
//����Դ�������ļ��������������ݿ⣬���������������ĳ��� 
//�����ȡ�ļ������ݵ������У�վ�ڳ���ĽǶ��������ͽ��������� 
//�������� InputStream 
//�������OutputStream
public class Demo06 {
	public static void main(String[] args) {
		/**
		 * 2���ļ�������
		 */
		try {
			File f = new File("d:/lol.txt");
			//���������ļ���������
			FileInputStream fis = new FileInputStream(f);
			// ͨ��������������Ϳ��԰����ݴ�Ӳ�̣���ȡ��Java������������Ҳ���Ƕ�ȡ���ڴ���
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		/**
		 * 3�������
		 */
		try {
			File f2 = new File("d:/dota.txt");
			// ���������ļ��������
			FileOutputStream fos = new FileOutputStream(f2);
			// ͨ�������������Ϳ��԰����ݴ��ڴ棬�����Ӳ�̵��ļ���
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	
}
