package io;

import java.io.UnsupportedEncodingException;

/**
 * ���ֶ�Ӧ����
 * @author Administrator
 *
 */
public class Demo22 {
    public static void main(String[] args) throws UnsupportedEncodingException {
//      �ҳ� E5 B1 8C ��3��ʮ�����ƶ�ӦUTF-8����ĺ���
        byte[] bs = new byte[3];
        bs[0] = (byte) 0xE5;
        bs[1] = (byte) 0xB1;
        bs[2] = (byte) 0x8C;
         
        String str  =new String(bs,"UTF-8");
        System.out.println("E5 B1 8C ��Ӧ���ַ��ǣ�"+str);
    }
}
