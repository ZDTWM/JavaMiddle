package collection.framework;

import java.util.ArrayList;
import java.util.List;

public class Demo04 {
	public static void main(String[] args) {
		
		/**
		 * 1��ArrayList��List
		 */
        //������д�������������Ϊ�ӿ�List����
        //ע�⣺��java.util.List,������java.awt.List
        //�ӿ�����ָ��������󣨶�̬��
		List heros = new ArrayList();
		heros.add(new Hero("����"));
		System.out.println(heros.size());
		
		/**
		 * 2��List�ӿڵķ���
		 */
		//��ΪArrayListʵ����List�ӿڣ�����List�ӿڵķ���ArrayList��ʵ���ˡ�
		//��ArrayList ���÷����½�����ϸ�Ľ��⣬�ڴ˲���׸��
	}
}
