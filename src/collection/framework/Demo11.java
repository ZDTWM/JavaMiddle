package collection.framework;

import java.util.HashMap;

/**
 * 
 * �������ظ���ֵ�����ظ�
 * 	����HashMap���ԣ�key��Ψһ�ģ��������ظ��ġ� 
 * 	���ԣ�����ͬ��key �Ѳ�ͬ��value���뵽 Map�лᵼ�¾�Ԫ�ر����ǣ�ֻ�����������Ԫ�ء� 
 * 	������ͬһ�����������Ϊֵ���뵽map�У�ֻҪ��Ӧ��key��һ��
 */
public class Demo11 {
	public static void main(String[] args) {
		HashMap<String,Hero> heroMap = new HashMap<String,Hero>();
		heroMap.put("gareen", new Hero("gareen1"));
		System.out.println(heroMap);
		
	    //keyΪgareen�Ѿ���value�ˣ�����gareen��Ϊkey�������ݣ��ᵼ��ԭӢ�ۣ�������
        //���������µ�Ԫ�ص�Map��
		heroMap.put("gareen", new Hero("gareen2"));
		System.out.println(heroMap);
		
		//���map
		heroMap.clear();
		
		Hero gareen = new Hero("gareen");
		heroMap.put("hero1", gareen);
		heroMap.put("hero2", gareen);
		
		System.out.println(heroMap);
	}
}
