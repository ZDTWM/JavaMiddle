package abnormal;
/**
 * 2������ʱ�쳣�����ɲ��쳣��
 * @author Administrator
 *
 */
public class Demo09 {
	
	//����ʱ�쳣RuntimeExceptionָ�� ���Ǳ������try catch���쳣 
	//��������ʱ�쳣: 
	//��������Ϊ0�쳣:ArithmeticException 
	//�±�Խ���쳣:ArrayIndexOutOfBoundsException 
	//��ָ���쳣:NullPointerException 
	//�ڱ�д�����ʱ����Ȼ����ʹ��try catch throws���д�����ɲ��쳣��֮ͬ�����ڣ����㲻����try catch��Ҳ�����б������ 
	//Java֮���Ի��������ʱ�쳣��ԭ��֮һ������Ϊ�±�Խ�磬��ָ����Щ����ʱ�쳣̫�����ձ飬�������Ҫ���в�׽������Ŀɶ��Ծͻ��ú���⡣
	
	public static void main(String[] args) {
		//�κγ�������Ϊ0:ArithmeticException
		int k = 5/0;
		//�±�Խ���쳣��ArrayIndexOutOfBoundsException
		int j[] = new int[5];
		j[10] = 10;
		//��ָ���쳣��NullPointerException
		String str = null;
		str.length();
	}
	
}
