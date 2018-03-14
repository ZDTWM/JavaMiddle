package collection.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ����
 * @author Administrator
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<Hero>();
		
		// ��5��Hero��������
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero name " + i));
		}
		
		/**
		 * ��һ�ֱ��� :for ѭ��
		 */
		System.out.println("-----------for ѭ��--------------");
		for (int i = 0; i < heros.size(); i++) {
			Hero h = heros.get(i);
			System.out.println(h);
		}
		/**
		 * �ڶ��ֱ���������������
		 */
		//��������whileд��
		System.out.println("--------ʹ��while��iterator-------");		
		Iterator<Hero> it = heros.iterator();
        //���ʼ��λ���ж�"��һ��"λ���Ƿ�������
        //����о�ͨ��nextȡ���������Ұ�ָ�������ƶ�
        //ֱ��"��һ��"λ��û������
		while(it.hasNext()){
			Hero h = it.next();
			System.out.println(h);
		}
		//��������forд��
		System.out.println("--------ʹ��for��iterator-------");
		for (Iterator<Hero> iterator = heros.iterator();iterator.hasNext();) {
			Hero hero = iterator.next();
			System.out.println(hero);
		}
		/**
		 * �����֣���ǿ�͵�forѭ��
		 */
		System.out.println("--------��ǿ��forѭ��-------");
		for (Hero h : heros) {
			System.out.println(h);
		}
	}
}
