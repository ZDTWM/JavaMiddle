package collection.framework;

import java.util.HashSet;

/**
 * 
 * HashSet
 *
 */
public class Demo12 {
	public static void main(String[] args) {
		/**
		 * 1��Set�е�Ԫ�أ������ظ�
		 */
		HashSet<String> names = new HashSet<String>();
		names.add("gareen");
		System.out.println(names);
		//�ڶ��β���ͬ�������ݣ��ǲ岻��ȥ�ģ�������ֻ�ᱣ��һ��
		names.add("gareen");
		System.out.println(names);
		
		/**
		 * 2��Set�е�Ԫ�أ�û��˳��
		 */
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(9);
		numbers.add(5);
		numbers.add(1);
		
		// Set�е�Ԫ�����У����ǰ��ղ���˳��
		System.out.println(numbers);
	}
}
