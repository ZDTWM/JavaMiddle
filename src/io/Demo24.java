package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*�Խ�����Ӳ��Ϊ�����ֽ������ַ����ı׶ˣ� 
��ÿһ�ζ�д��ʱ�򣬶������Ӳ�̡� �����д��Ƶ�ʱȽϸߵ�ʱ�������ܱ��ֲ��ѡ� 

Ϊ�˽�����ϱ׶ˣ����û������� 
�������ڶ�ȡ��ʱ�򣬻�һ���Զ��϶�����ݵ������У��Ժ�ÿһ�εĶ�ȡ�������ڻ����з��ʣ�ֱ�������е����ݶ�ȡ��ϣ��ٵ�Ӳ��������ȡ�� 

�ͺñȳԷ������û������ÿ��һ�ڶ�������ȥ�����û�������Ȱѷ�ʢ���������ĳ����ˣ��ٵ�����ȥ�� 

��������д�����ݵ�ʱ�򣬻��Ȱ�����д�뵽��������ֱ���������ﵽһ���������Ű���Щ���ݣ�һ��д�뵽Ӳ����ȥ���������ֲ���ģʽ���Ͳ������ֽ������ַ�������ÿдһ���ֽڶ�����Ӳ�̣��Ӷ�������IO����*/
public class Demo24 {
	/**
	 * ʹ�û�������ȡ����
	 */
	public static void main(String[] args) {
		
        // ׼���ļ�lol.txt���е�������
        // garen kill teemo
        // teemo revive after 1 minutes
        // teemo try to garen, but killed again
		File f = new File("d:/lol.txt");
        // �����ļ��ַ���
        // ���������뽨����һ�����ڵ����Ļ�����
		try (	
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
			)
		{
			while(true){
				//һ�ζ�һ��
				String line  = br.readLine();
				if(null == line)
					break;
				System.out.println(line);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
