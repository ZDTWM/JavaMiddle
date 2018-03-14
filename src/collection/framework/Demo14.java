package collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Collections��һ���࣬
 * �����Ĺ�����,����ͬArrays������Ĺ�����
 *
 */
public class Demo14 {
	public static void main(String[] args) {
		//��ʼ������numbers
		List<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		
		System.out.println("�����е�����:");
		System.out.println(numbers);
		
		/**
		 * 1����ת
		 */
		Collections.reverse(numbers);
		
		System.out.println("��ת�󼯺��е�����:");
		System.out.println(numbers);
		/**
		 * 2������
		 */
		Collections.shuffle(numbers);
		
		System.out.println("�����󼯺��е�����:");
		System.out.println(numbers);
		/**
		 * 3������
		 */
		Collections.sort(numbers);
		System.out.println("����󼯺��е�����:");
		System.out.println(numbers);
		/**
		 * 4������
		 */
		Collections.swap(numbers, 0, 5);
		System.out.println("����0��5�±�����ݺ󣬼����е�����:");
		System.out.println(numbers);
		/**
		 * 5������
		 */
		Collections.rotate(numbers, 2);
		System.out.println("�Ѽ������ҹ���2����λ��������ݺ󣬼����е�����:");
		System.out.println(numbers);
		/**
		 * 6���̰߳�ȫ��
		 * 	synchronizedList �ѷ��̰߳�ȫ��Listת��Ϊ�̰߳�ȫ��List��
		 */
		System.out.println("�ѷ��̰߳�ȫ��Listת��Ϊ�̰߳�ȫ��List");
		List<Integer> synchronizedNumbers = Collections.synchronizedList(numbers);
		
		
		
		
	}
}
