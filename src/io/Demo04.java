package io;

import java.io.File;

/**
 * ��ϰ�������ļ���
 * @author Administrator
 *
 */
//һ��˵������ϵͳ���ᰲװ��C�̣����Ի���һ�� C:\WINDOWSĿ¼��
//�������Ŀ¼�����е��ļ�(���ñ�����Ŀ¼)
//�ҳ���Щ�ļ�����ĺ���С(��0)���Ǹ��ļ�����ӡ�����ǵ��ļ���
//ע: ��С���ļ�������0����
public class Demo04 {
	public static void main(String[] args) {
		
		File f = new File("C:\\Windows");
		File[] fs = f.listFiles();
		if(null == fs)
			return;
		long minSize = Integer.MAX_VALUE;
		long maxSize = 0;
		File minFile = null;
		File maxFile = null;
		for(File file : fs){
			if(file.isDirectory())
				continue;
			if(file.length()>maxSize){
				maxSize = file.length();
				maxFile = file;
			}
			if(file.length() != 0 && file.length() < minSize){
				minSize = file.length();
				minFile = file;
			}
			
		}
		System.out.printf("�����ļ��ǣ�%s�����С�ǣ�%d �ֽ�%n",maxFile.getAbsolutePath(),maxFile.length());
		System.out.printf("��С���ļ��ǣ�%s�����С�ǣ�%d �ֽ�%n",minFile.getAbsolutePath(),minFile.length());
	}
}
