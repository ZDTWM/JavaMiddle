package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * flush
 * �е�ʱ����Ҫ����������д�뵽Ӳ�̣������ǵȻ������˲�д��ȥ�� ��ʱ�����Ҫ�õ�flush
 * @author Administrator
 *
 */
public class Demo26 {
	public static void main(String[] args) {
		//���ļ�lol3.txt��д���������
		File f = new File("d:/lol3.txt");
		try (
		        //�����ļ��ַ���
		        //���������뽨����һ�����ڵ����Ļ�����
				FileWriter fr = new FileWriter(f);
				PrintWriter pw = new PrintWriter(fr);				
			)
		{
			//ǿ�ưѻ����е�����д��Ӳ�̣����ۻ����Ƿ�����
			pw.println("garen kill teemo");
			pw.flush();
			pw.println("teemo revive after 1 minutes");
			pw.flush();
			pw.println("teemo try to garen, but killed again");
			pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
