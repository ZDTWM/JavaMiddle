package io;

import java.io.File;

/**
 * �ļ����÷���2
 * @author Administrator
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		File f = new File("D:/LOLFolder/skin/garen.ski");
		
		// ���ַ����������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
		String[] fs1 = f.list();
		
		// ���ļ��������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
		File[] fs2 = f.listFiles();
		
		// ���ַ�����ʽ���ػ�ȡ�����ļ���
		String fs3 = f.getParent();
		
		// �����ļ��У�������ļ���skin�����ڣ���������Ч
		f.mkdir();
		
		// �����ļ��У�������ļ���skin�����ڣ��ͻᴴ�����ļ���
		f.mkdirs();
		
		// ����һ�����ļ�,������ļ���skin�����ڣ��ͻ��׳��쳣
		//f.createNewFile();
		
		// ���Դ���һ�����ļ�֮ǰ��ͨ�����ᴴ����Ŀ¼
		f.getParentFile().mkdirs();
		
		// �г����е��̷�c: d: e: �ȵ�
		f.listRoots();
		
		//ɾ���ļ�
		f.delete();
		
		// JVM������ʱ�򣬄h���ļ�����������ʱ�ļ���ɾ��
		f.deleteOnExit();
		
	}
}
