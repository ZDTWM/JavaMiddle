package collection.framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 遍历
 * @author Administrator
 *
 */
public class Demo07 {
	public static void main(String[] args) {
		List<Hero> heros = new ArrayList<Hero>();
		
		// 放5个Hero进入容器
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero name " + i));
		}
		
		/**
		 * 第一种遍历 :for 循环
		 */
		System.out.println("-----------for 循环--------------");
		for (int i = 0; i < heros.size(); i++) {
			Hero h = heros.get(i);
			System.out.println(h);
		}
		/**
		 * 第二种遍历：迭代器遍历
		 */
		//迭代器的while写法
		System.out.println("--------使用while的iterator-------");		
		Iterator<Hero> it = heros.iterator();
        //从最开始的位置判断"下一个"位置是否有数据
        //如果有就通过next取出来，并且把指针向下移动
        //直达"下一个"位置没有数据
		while(it.hasNext()){
			Hero h = it.next();
			System.out.println(h);
		}
		//迭代器的for写法
		System.out.println("--------使用for的iterator-------");
		for (Iterator<Hero> iterator = heros.iterator();iterator.hasNext();) {
			Hero hero = iterator.next();
			System.out.println(hero);
		}
		/**
		 * 第三种：增强型的for循环
		 */
		System.out.println("--------增强型for循环-------");
		for (Hero h : heros) {
			System.out.println(h);
		}
	}
}
