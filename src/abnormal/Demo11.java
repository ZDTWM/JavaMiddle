package abnormal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 1��Throwable
 * @author Administrator
 *
 */
public class Demo11 {
	
	//Throwable���࣬Exception��Error���̳��˸���
	//�����ڲ�׽��ʱ��Ҳ����ʹ��Throwable���в�׽
	//��ͼ�� �쳣��Error��Exception
	//Exception���ַ�����ʱ�쳣�Ϳɲ��쳣��
	
	public static void main(String[] args) {
		File f = new File("d:/LOL.exe");
		try {
			new FileInputStream(f);
			//ʹ��Throwable�����쳣��׽
		} catch (Throwable t) {
			// TODO Auto-generated catch block
			t.printStackTrace();
		}
	}
}
