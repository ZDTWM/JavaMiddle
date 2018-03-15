package thread.synchronize;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * synchronized ͬ���������
 * synchronized��ʾ��ǰ�̣߳���ռ ���� someObject
 * ��ǰ�̶߳�ռ �˶���someObject������������߳���ͼռ�ж���someObject���ͻ�ȴ���ֱ����ǰ�߳��ͷŶ�someObject��ռ�á�
 * someObject �ֽ�ͬ���������еĶ��󣬶�������Ϊͬ������
 * Ϊ�˴ﵽͬ����Ч��������ʹ��ͬһ��ͬ������
 * �ͷ�ͬ������ķ�ʽ�� synchronized ����Ȼ�������������쳣�׳�
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
        final Object someObject = new Object();
        
        Thread t1 = new Thread(){
            public void run(){
                try {
                    System.out.println( now()+" t1 �߳��Ѿ�����");
                    System.out.println( now()+this.getName()+ " ��ͼռ�ж���someObject");
                    synchronized (someObject) {
                          
                        System.out.println( now()+this.getName()+ " ռ�ж���someObject");
                        Thread.sleep(5000);
                        System.out.println( now()+this.getName()+ " �ͷŶ���someObject");
                    }
                    System.out.println(now()+" t1 �߳̽���");
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        t1.setName(" t1");
        t1.start();
        Thread t2 = new Thread(){
  
            public void run(){
                try {
                    System.out.println( now()+" t2 �߳��Ѿ�����");
                    System.out.println( now()+this.getName()+ " ��ͼռ�ж���someObject");
                    synchronized (someObject) {
                        System.out.println( now()+this.getName()+ " ռ�ж���someObject");
                        Thread.sleep(5000);
                        System.out.println( now()+this.getName()+ " �ͷŶ���someObject");
                    }
                    System.out.println(now()+" t2 �߳̽���");
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        t2.setName(" t2");
        t2.start();
				
	}
	
	public static String now(){
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}
	
}
