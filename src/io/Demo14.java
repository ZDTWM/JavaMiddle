package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ʹ���ַ������ַ���д�뵽�ļ�
 * @author Administrator
 * FileWriter ��Writer�����࣬��FileWriter Ϊ�����ַ���д�뵽�ļ�
 */
public class Demo14 {

	public static void main(String[] args) {
		 // ׼���ļ�lol2.txt
		File f = new File("d:/lol2.txt");
		// ���������ļ���Writer
		try(FileWriter fr = new FileWriter(f);) {
			// ���ַ�������ʽ������д�뵽�ļ���
			String data = "abcdefg1234567890";
			//���ַ�����ֳ��ַ�����
			char[] cs = data.toCharArray();
			
			fr.write(cs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
