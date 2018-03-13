package collection.framework;

import java.util.ArrayList;

public class Demo03 {
	public static void main(String[] args) {
		ArrayList heros = new ArrayList();
		/**
		 * 1�����ӣ�add
		 */
		//(1)��5��������뵽ArrayList��
		for (int i = 0; i < 5; i++) {
			heros.add(new Hero("hero " + i));
		}
		System.out.println(heros);
		
		// (2)��ָ��λ�����Ӷ���
		Hero specialHero = new Hero("special hero");
		heros.add(3,specialHero);
		System.out.println(heros.toString());
		/**
		 * 2���ж��Ƿ���ڣ�contains
		 * 	�ж�һ�������Ƿ���������
		 * 	�жϱ�׼�� �Ƿ���ͬһ�����󣬶�����name�Ƿ���ͬ
		 */
		System.out.print("��Ȼһ���µĶ�������Ҳ�� hero 1������contains�ķ�����:");
		System.out.println(heros.contains(new Hero("hero 1")));//false
		System.out.print("����specialHero���жϣ�contains�ķ�����:");
		System.out.println(heros.contains(specialHero));//true
		/**
		 * 3����ȡָ��λ�ö���
		 * 	ͨ��get��ȡָ��λ�õĶ������������±�Խ�磬һ���ᱨ��
		 */
		//��ȡָ��λ�õĶ���
		System.out.println(heros.get(5));
		//��������˷�Χ����Ȼ�ᱨ��
		//System.out.println(heros.get(6));
		/**
		 * 4����ȡ����������λ��
		 * 	indexOf �����ж�һ��������ArrayList��������λ����containsһ����
		 *  �жϱ�׼�Ƕ����Ƿ���ͬ�����Ƕ����nameֵ�Ƿ����
		 */
		System.out.println("specialHero������λ��:" + heros.indexOf(specialHero));
		System.out.println("�µ�Ӣ�ۣ�����������\"hero 1\"������λ��:" + heros.indexOf(new Hero("hero 1")));
		/**
		 * 5��ɾ��
		 * 	remove���ڰѶ����ArrayList��ɾ��
		 * 	remove���Ը����±�ɾ��ArrayList��Ԫ�أ�Ҳ���Ը��ݶ���ɾ��
		 */
		heros.remove(2);
		System.out.println("ɾ���±���2�Ķ���");
		System.out.println(heros);
		System.out.println("ɾ��special hero");
		heros.remove(specialHero);
		System.out.println(heros);
		/**
		 * 6���滻
		 * 	set�����滻ָ��λ�õ�Ԫ��
		 */
		System.out.println("���±���5��Ԫ�أ��滻Ϊ\"hero 5\"");
		heros.set(2, new Hero("hero 5"));
		System.out.println(heros);
		/**
		 * 7����ȡ��С
		 * 	size ���ڻ�ȡArrayList�Ĵ�С
		 */
		System.out.println("��ȡArrayList�Ĵ�С��");
		System.out.println(heros.size());
		/**
		 * 8��ת������
		 * 	toArray���԰�һ��ArrayList����ת��Ϊ���顣
		 * 	��Ҫע����ǣ����Ҫת��Ϊһ��Hero���飬
		 * 	��ô��Ҫ����һ��Hero�������͵Ķ����toArray()������toArray������֪����
		 * 	��ϣ��ת��Ϊ�������͵����飬����ֻ��ת��ΪObject����
		 */
		Hero hs[] = (Hero[])heros.toArray(new Hero[]{});
		System.out.println("���飺" + hs);
		/**
		 * 9������һ���������ж��󶼼ӽ���
		 * 	addAll ����һ���������ж��󶼼ӽ���
		 */
		ArrayList anotherHeros = new ArrayList();
		anotherHeros.add(new Hero("hero a"));
		anotherHeros.add(new Hero("hero b"));
		anotherHeros.add(new Hero("hero c"));
		System.out.println("anotherHeros:\t" + anotherHeros);
		heros.addAll(anotherHeros);
		System.out.println("����һ��ArrayList��Ԫ�ض����뵽��ǰArrayList:");
		System.out.println("ArrayList heros:\t" + heros);
		/**
		 * 10�����
		 * 	clear�����һ��ArrayList
		 */
		System.out.println("ArrayList heros:\t" + heros);
		System.out.println("ʹ��clear���");
		heros.clear();
		System.out.println("ArrayList heros:\t" + heros);
		
		
		
	}
}
