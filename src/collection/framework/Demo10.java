package collection.framework;

import java.util.HashMap;
/**
 * HashMap�ļ�ֵ��
 *
 */
public class Demo10 {
	public static void main(String[] args) {
		/**
		 * HashMap�������ݵķ�ʽ�ǡ��� ��ֵ��
		 */
		HashMap<String,String> dictionary = new HashMap<>();
		dictionary.put("adc", "����Ӣ��");
		dictionary.put("apc", "ħ��Ӣ��");
		dictionary.put("t", "̹��");
		System.out.println(dictionary.get("t"));
	}
}
