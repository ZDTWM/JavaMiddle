package collection.framework;

import java.util.ArrayList;
import java.util.List;

public class Demo05 {
	public static void main(String[] args) {
		
		//���ڲ�ʹ�÷��͵������������������Ӣ�ۣ�Ҳ�������������Ʒ
		List heros = new ArrayList();
		heros.add(new Hero("����"));
		//�������ڴ��Ӣ�۵�����������Ҳ���Դ����Ʒ��
		heros.add(new Item("����"));		
		System.out.println(heros);
		
		//����ת�ͻ��������
		Hero h1 = (Hero) heros.get(0);
		//��������������ŵĶ���̫���ʱ�򣬾ͼǲ�����ĸ�λ�÷ŵ����������͵Ķ�����
		//Hero h2 = (Hero) heros.get(1);
		
        //���뷺��Generic
        //����������ʱ�򣬾�ָ��������������ֻ�ܷ�Hero���������ľͻ����
		List<Hero> genericheros = new ArrayList<Hero>();
		genericheros.add(new Hero("����"));
		//�������Hero���ͣ������ͷŲ���ȥ
		//genericheros.add(new Item("����"));
		
		//����֮�⣬���ܴ��Hero������
		genericheros.add(new APHero());
		
		//������ȡ�����ݵ�ʱ�򣬲���Ҫ�ٽ���ת���ˣ���Ϊ����϶��Ƿŵ�Hero����������
		Hero h = genericheros.get(0);
	}
}
