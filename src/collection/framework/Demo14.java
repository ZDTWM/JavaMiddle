package collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Collections是一个类，
 * 容器的工具类,就如同Arrays是数组的工具类
 *
 */
public class Demo14 {
	public static void main(String[] args) {
		//初始化集合numbers
		List<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}
		
		System.out.println("集合中的数据:");
		System.out.println(numbers);
		
		/**
		 * 1、反转
		 */
		Collections.reverse(numbers);
		
		System.out.println("翻转后集合中的数据:");
		System.out.println(numbers);
		/**
		 * 2、混淆
		 */
		Collections.shuffle(numbers);
		
		System.out.println("混淆后集合中的数据:");
		System.out.println(numbers);
		/**
		 * 3、排序
		 */
		Collections.sort(numbers);
		System.out.println("排序后集合中的数据:");
		System.out.println(numbers);
		/**
		 * 4、交换
		 */
		Collections.swap(numbers, 0, 5);
		System.out.println("交换0和5下标的数据后，集合中的数据:");
		System.out.println(numbers);
		/**
		 * 5、滚动
		 */
		Collections.rotate(numbers, 2);
		System.out.println("把集合向右滚动2个单位，标的数据后，集合中的数据:");
		System.out.println(numbers);
		/**
		 * 6、线程安全化
		 * 	synchronizedList 把非线程安全的List转换为线程安全的List。
		 */
		System.out.println("把非线程安全的List转换为线程安全的List");
		List<Integer> synchronizedNumbers = Collections.synchronizedList(numbers);
		
		
		
		
	}
}
