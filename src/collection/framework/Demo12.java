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
		 * 1、Set中的元素，不能重复
		 */
		HashSet<String> names = new HashSet<String>();
		names.add("gareen");
		System.out.println(names);
		//第二次插入同样的数据，是插不进去的，容器中只会保留一个
		names.add("gareen");
		System.out.println(names);
		
		/**
		 * 2、Set中的元素，没有顺序。
		 */
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(9);
		numbers.add(5);
		numbers.add(1);
		
		// Set中的元素排列，不是按照插入顺序
		System.out.println(numbers);
	}
}
