package io;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

/**
 * �ر����ķ�ʽ
 * @author Administrator
 *
 */
public class Demo10 {
	/**
	 * 1���� try�йرգ�
	 * @param args
	 * 	��try����������ر��ļ�����������ǰ���ʾ���ж���ʹ�����ַ�ʽ����������һ���׶ˣ�
	 * 	����ļ������ڣ����߶�ȡ��ʱ�����������׳��쳣����ô�Ͳ���ִ����һ�йر����Ĵ��룬���ھ޴����Դռ�������� ���Ƽ�ʹ��
	 */
	public static void main(String[] args) {
		
		try {
			File f = new File("d:/lol.txt");
			FileInputStream fis = new FileInputStream(f);
			byte[] all = new byte[(int) f.length()];
			fis.read(all);
			for(byte b : all){
				System.out.println(b);
			}
			//��try ��ر���
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
