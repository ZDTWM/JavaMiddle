package abnormal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 异常处理：
 * 	多异常捕捉办法1
 * @author Administrator
 *
 */
public class Demo04 {
	public static void main(String[] args) {
		File f = new File("d:/LOL.exe");
		/**
		 * 	这段代码，会抛出 文件不存在异常 FileNotFoundException 和 解析异常ParseException 
		 * 	解决办法之一是分别进行catch
		 */
		try {
			System.out.println("试图打开 d:/LOL.exe");
			new FileInputStream(f);
			System.out.println("成功打开");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date d = sdf.parse("2016-12-12");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (ParseException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
