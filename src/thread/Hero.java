package thread;

public class Hero {
	public String name;
	public float hp;
	public int damage;
	public void attackHero(Hero h){
		
        //����ͣʱ��ȥ���������̸߳��Իᾡ��ȥռ��CPU��Դ
        //�̵߳����ȼ�Ч���ſ��Կ��ó���
/*		try {
			//Ϊ�˱�ʾ������Ҫʱ�䣬ÿ�ι�����ͣ1000����
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		h.hp -= damage;
		System.out.format("%s ���ڹ��� %s, %s��Ѫ����� %.0f%n",name,h.name,h.name,h.hp);
		
		if(h.isDead())
			System.out.println(h.name + "���ˣ�");
		
	}
	
	public boolean isDead() {
		return 0 >= hp?true:false;
	}
	
}
