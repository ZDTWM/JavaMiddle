package abnormal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �쳣����
 * 	���쳣��׽�취1
 * @author Administrator
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		File f = new File("d:/LOL.exe");
		/**
		 * 	��δ��룬���׳� �ļ��������쳣 FileNotFoundException �� �����쳣ParseException 
		 * 	����취֮һ�Ƿֱ����catch
		 */
		try {
			System.out.println("��ͼ�� d:/LOL.exe");
			new FileInputStream(f);
			System.out.println("�ɹ���");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d = sdf.parse("2016-12-12");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
