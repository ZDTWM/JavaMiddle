package collection.framework;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 泛型的简写
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		//为了不使编译器出现警告，需要前后都使用泛型，像这样：
		List<Hero> genericheros = new ArrayList<Hero>();
		//后面的泛型可以用<>来代替，聊胜于无吧
		List<Item> genericitems = new ArrayList<>();
	}
}
