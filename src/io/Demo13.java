package io;

import java.io.File;

import java.io.FileReader;
import java.io.IOException;

/**
 * �ַ�����
 * 	Reader���ַ�������
 * 	Writer���ַ������
 * 	ר�������ַ�����ʽ��ȡ��д������
 */
public class Demo13 {

	public static void main(String[] args) {
		// ׼���ļ�lol.txt���е�������AB
		File f = new File("d:/lol.txt");
		 // ���������ļ���Reader
		try (FileReader fr = new FileReader(f);){
			// �����ַ����飬�䳤�Ⱦ����ļ��ĳ���
			char[] all = new char[(int) f.length()];
			// ���ַ�������ʽ��ȡ�ļ���������
			fr.read(all);
			for(char b : all){
				// ��ӡ������A B
				System.out.println(b);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
