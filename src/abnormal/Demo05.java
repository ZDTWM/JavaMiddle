package abnormal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���쳣��׽�취2
 * @author Administrator
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		File f =new File("d:/LOL.exe");
		/**
		 * ��һ���ְ취�ǰѶ���쳣������һ��catch��ͳһ��׽ 
		 * ���ַ�ʽ�� JDK7��ʼ֧�֣��ô��ǲ�׽�Ĵ�������գ�
		 * ����֮���ǣ�һ�������쳣������ȷ�������������쳣����Ҫͨ��instanceof �����жϾ�����쳣����
		 */
		try {
			System.out.println("��ͼ�� d:/LOL.exe");
			new FileInputStream(f);
			System.out.println("�ɹ���");
			SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");
			Date d = sdf.parse("2016-12-12");
		} catch (FileNotFoundException | ParseException e) {
			if(e instanceof FileNotFoundException)
				 System.out.println("d:/LOL.exe������");
			if(e instanceof ParseException)
				System.out.println("���ڸ�ʽ��������");
			e.printStackTrace();
		}
		
	}
}