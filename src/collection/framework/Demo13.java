package collection.framework;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet����
 *
 */
public class Demo13 {
	public static void main(String[] args) {		
		//Set���ṩget()����ȡָ��λ�õ�Ԫ�� 
		//���Ա�����Ҫ�õ���������������ǿ��forѭ��
		
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		for (int i = 0; i < 20; i++) {
			numbers.add(i);
		}
		
        //Set���ṩget��������ȡָ��λ�õ�Ԫ��
        //numbers.get(0)
		
		//����Set���Բ��õ�����iterator
		for (Iterator<Integer> iterator = numbers.iterator();iterator.hasNext();) {
			Integer i = iterator.next();
			System.out.println(i);
		}
		
		//���߲�����ǿ��forѭ��
		for (Integer i : numbers) {
			System.out.println(i);
		}
		
	}
}
