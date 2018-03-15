package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * ����׼��һ���ӿ�HeroChecker���ṩһ��test(Hero)����
 * Ȼ��ͨ��������ķ�ʽ��ʵ������ӿ�
 * ���ŵ���filter���������checker��ȥ�����жϣ�
 * ���ַ�ʽ�ͺ���ͨ��Collections.sort�ڶ�һ��Hero��������
 * ��Ҫ��һ��Comparator������������ȥһ����
 */
public class Demo02 {
	public static void main(String[] args) {
		
		Random r = new Random();
		List<Hero> heros = new ArrayList<Hero>();
		for (int i = 0; i < 5; i++) {
			 heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
		}
		System.out.println("��ʼ����ļ��ϣ�");
		System.out.println(heros);
		System.out.println("ʹ��������ķ�ʽ��ɸѡ�� hp>100 && damange<50��Ӣ��");
		HeroChecker checker = new HeroChecker(){
			@Override
			public boolean test(Hero h) {
				return (h.hp > 100 && h.damage < 50);
			}
			
		};
		filter(heros,checker);
	}
	
	private static void filter(List<Hero> heros,HeroChecker checker){
		for(Hero hero : heros){
			if(checker.test(hero))
				System.out.println(hero);
		}
	}
}