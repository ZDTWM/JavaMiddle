package io;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 * д�����ݵ��ļ�
 * @author Administrator
 *
 */
//���ֽ�������ʽ���ļ�д������ �е����ӣ���lol2.txt�����ڵ�ʱ���ǻ��Զ�����lol2.txt�ļ��ġ�
//���ǣ������д�����ݵ�d:/xyz/lol2.txt����Ŀ¼xyz�ֲ����ڵĻ����ͻ��׳��쳣��
//��ô��ô�Զ�����xyzĿ¼��
//����Ƕ��Ŀ¼ d:/xyz/abc/def/lol2.txt �أ�
public class Demo09 {

	public static void main(String[] args) {
		
		try {
			File f = new File("d:/xyz/abc/def/lol2.txt");
			//��ΪĬ������£��ļ�ϵͳ�в����� d:\xyz\abc\def�����������ʧ��
			//���Ȼ�ȡ�ļ����ڵ�Ŀ¼
			File dir = f.getParentFile();
			//�����Ŀ¼�����ڣ��򴴽���Ŀ¼
			if(!dir.exists()){
				//dir.mkdir();//ʹ��mkdir���׳��쳣����Ϊ��Ŀ¼�ĸ�Ŀ¼Ҳ������
				dir.mkdirs();
			}			
			byte data[] = {88,89};
			FileOutputStream fos = new FileOutputStream(f);
			fos.write(data);
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
