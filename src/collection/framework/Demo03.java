package collection.framework;

import java.util.ArrayList;

public class Demo03 {
	public static void main(String[] args) {
		ArrayList heros = new ArrayList();
		/**
		 * 1、增加：add
		 */
		//(1)把5个对象加入到ArrayList中
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		System.out.println(heros);
		
		// (2)在指定位置增加对象
		Hero specialHero = new Hero("special hero");
		heros.add(3,specialHero);
		System.out.println(heros.toString());
		/**
		 * 2、判断是否存在：contains
		 * 	判断一个对象是否在容器中
		 * 	判断标准： 是否是同一个对象，而不是name是否相同
		 */
		System.out.print("虽然一个新的对象名字也叫 hero 1，但是contains的返回是:");
		System.out.println(heros.contains(new Hero("hero 1")));//false
		System.out.print("而对specialHero的判断，contains的返回是:");
		System.out.println(heros.contains(specialHero));//true
		/**
		 * 3、获取指定位置对象
		 * 	通过get获取指定位置的对象，如果输入的下标越界，一样会报错
		 */
		//获取指定位置的对象
		System.out.println(heros.get(5));
		//如果超出了范围，依然会报错
		//System.out.println(heros.get(6));
		/**
		 * 4、获取对象所出的位置
		 * 	indexOf 用于判断一个对象在ArrayList中所处的位置与contains一样，
		 *  判断标准是对象是否相同，而非对象的name值是否相等
		 */
		System.out.println("specialHero所处的位置:" + heros.indexOf(specialHero));
		System.out.println("新的英雄，但是名字是\"hero 1\"所处的位置:" + heros.indexOf(new Hero("hero 1")));
		/**
		 * 5、删除
		 * 	remove用于把对象从ArrayList中删除
		 * 	remove可以根据下标删除ArrayList的元素，也可以根据对象删除
		 */
		heros.remove(2);
		System.out.println("删除下标是2的对象");
		System.out.println(heros);
		System.out.println("删除special hero");
		heros.remove(specialHero);
		System.out.println(heros);
		/**
		 * 6、替换
		 * 	set用于替换指定位置的元素
		 */
		System.out.println("把下标是5的元素，替换为\"hero 5\"");
		heros.set(2, new Hero("hero 5"));
		System.out.println(heros);
		/**
		 * 7、获取大小
		 * 	size 用于获取ArrayList的大小
		 */
		System.out.println("获取ArrayList的大小：");
		System.out.println(heros.size());
		/**
		 * 8、转换数组
		 * 	toArray可以把一个ArrayList对象转换为数组。
		 * 	需要注意的是，如果要转换为一个Hero数组，
		 * 	那么需要传递一个Hero数组类型的对象给toArray()，这样toArray方法才知道，
		 * 	你希望转换为哪种类型的数组，否则只能转换为Object数组
		 */
		Hero hs[] = (Hero[])heros.toArray(new Hero[]{});
		System.out.println("数组：" + hs);
		/**
		 * 9、把另一个容器所有对象都加进来
		 * 	addAll 把另一个容器所有对象都加进来
		 */
		ArrayList anotherHeros = new ArrayList();
		anotherHeros.add(new Hero("hero a"));
		anotherHeros.add(new Hero("hero b"));
		anotherHeros.add(new Hero("hero c"));
		System.out.println("anotherHeros:\t" + anotherHeros);
		heros.addAll(anotherHeros);
		System.out.println("把另一个ArrayList的元素都加入到当前ArrayList:");
		System.out.println("ArrayList heros:\t" + heros);
		/**
		 * 10、清空
		 * 	clear：清空一个ArrayList
		 */
		System.out.println("ArrayList heros:\t" + heros);
		System.out.println("使用clear清空");
		heros.clear();
		System.out.println("ArrayList heros:\t" + heros);
		
		
		
	}
}
