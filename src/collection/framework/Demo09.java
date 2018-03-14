package collection.framework;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * LinkedList:
 * 	LinkedList ����ʵ����List��Deque�⣬��ʵ����Queue�ӿ�(����)��
 *	Queue���Ƚ��ȳ����� FIFO�����÷�����
 *		offer ��������Ԫ��
 *		poll ȡ����һ��Ԫ��
 *		peek �鿴��һ��Ԫ��
 */
public class Demo09 {
	public static void main(String[] args) {
		//��ArrayListһ����LinkedListҲʵ����List�ӿ�
		List ll = new LinkedList<Hero>();
		
        //����ͬ����LinkedList��ʵ����Deque��������ʵ����Queue����ӿ�
        //Queue����FIFO �Ƚ��ȳ��Ķ���
		Queue<Hero> q = new LinkedList<Hero>();
		
		//���ڶ��е������
		System.out.println("��ʼ�����У�\t");
		q.offer(new Hero("Hero01"));
		q.offer(new Hero("Hero02"));
		q.offer(new Hero("Hero03"));
		q.offer(new Hero("Hero04"));
		System.out.println(q);
		
		System.out.println("�ѵ�һ��Ԫ��ȡpoll()������\t");
		//ȡ����һ��Hero��FIFO �Ƚ��ȳ�
		Hero h = q.poll();
		System.out.println(h);
		System.out.println("ȡ����һ��Ԫ��֮��Ķ���:\t");
		System.out.println(q);
		
		//�ѵ�һ���ó�����һ�������ǲ�ȡ����
		h = q.peek();
		System.out.println("�鿴peek()��һ��Ԫ��:\t");
		System.out.println(h);
		System.out.print("�鿴�����ᵼ�µ�һ��Ԫ�ر�ȡ����:\t");
		System.out.println(q);
	}
}
