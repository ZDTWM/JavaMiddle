package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * ��FileReader �ַ�����ȷ��ȡ����
 * @author Administrator
 *
 */
//FileReader�õ������ַ�������һ�����Ѿ����ֽڸ���ĳ�ֱ���ʶ������ַ���
//��FileReaderʹ�õı��뷽ʽ��Charset.defaultCharset()�ķ���ֵ����������ĵĲ���ϵͳ������GBK
//FileReader�ǲ����ֶ����ñ��뷽ʽ�ģ�Ϊ��ʹ�������ı��뷽ʽ��ֻ��ʹ��InputStreamReader�����棬��������
//new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8")); 
//�ڱ����У��ü��±����ΪUTF-8��ʽ��Ȼ����UTF-8����ʶ���Ӧ�������ˡ�
//���ͣ� Ϊʲô����ǰ����һ��?
//�����ʹ�ü��±����ΪUTF-8�ĸ�ʽ����ô�ڵ�һ���ֽ���һ����ʾ��������BOM������־����ļ�����UTF-8������ġ�
public class Demo21 {
	 public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
	        File f = new File("E:\\project\\j2se\\src\\test.txt");
	        System.out.println("Ĭ�ϱ��뷽ʽ:"+Charset.defaultCharset());
	        //FileReader�õ������ַ�������һ�����Ѿ����ֽڸ���ĳ�ֱ���ʶ������ַ���
	        //��FileReaderʹ�õı��뷽ʽ��Charset.defaultCharset()�ķ���ֵ����������ĵĲ���ϵͳ������GBK
	        try (FileReader fr = new FileReader(f)) {
	            char[] cs = new char[(int) f.length()];
	            fr.read(cs);
	            System.out.printf("FileReader��ʹ��Ĭ�ϵı��뷽ʽ%s,ʶ��������ַ��ǣ�%n",Charset.defaultCharset());
	            System.out.println(new String(cs));
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        //FileReader�ǲ����ֶ����ñ��뷽ʽ�ģ�Ϊ��ʹ�������ı��뷽ʽ��ֻ��ʹ��InputStreamReader������
	        //����ʹ��new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8")); ��������ʽ
	        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"))) {
	            char[] cs = new char[(int) f.length()];
	            isr.read(cs);
	            System.out.printf("InputStreamReader ָ�����뷽ʽUTF-8,ʶ��������ַ��ǣ�%n");
	            System.out.println(new String(cs));
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	         
	    }
}
