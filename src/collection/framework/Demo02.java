package collection.framework;

import java.util.ArrayList;

/**
 * ArrayList ��Ŷ���
 *
 */
public class Demo02 {
	//Ϊ�˽������ľ����ԣ�����������ĸ�� �������������� 
	//ArrayList 
	//����������"capacity"�����Ŷ�������ӣ��Զ����� 
	//ֻ��Ҫ����������������Ӣ�ۼ��ɣ����õ��Ļ��������ı߽����⡣
	public static void main(String[] args) {
		//������ArrayList�����ڴ�Ŷ���
		ArrayList heros = new ArrayList();
		heros.add(new Hero("����"));
		System.out.println(heros.size());
        //����������"capacity"�����Ŷ�������ӣ��Զ�����
        //ֻ��Ҫ����������������Ӣ�ۼ��ɣ����õ��Ļ��������ı߽����⡣		
		heros.add(new Hero("��Ī"));
		System.out.println(heros.size());
		
	}
}
