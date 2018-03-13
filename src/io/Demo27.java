package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ��������
 * 	DataInputStream ���������� 
 *	DataOutputStream ���������
 */
public class Demo27 {
	//ʹ����������writeUTF()��readUTF() ���Խ������ݵĸ�ʽ��˳���д
	//�籾����ͨ��DataOutputStream ���ļ�˳��д�� ����ֵ���������ַ����� Ȼ����ͨ��DataInputStream ˳�������Щ���ݡ�
	//ע�� Ҫ��DataInputStream ��ȡһ���ļ�������ļ���������DataOutputStream д���ģ���������EOFException��
	//��ΪDataOutputStream ��д����ʱ�����һЩ�����ǣ�ֻ��DataInputStream ���ܳɹ��Ķ�ȡ��
	public static void main(String[] args) {
		read();
		write();
	}
	
	private static void read(){
		
		File f = new File("d:/lol.txt");
		try(
				FileInputStream fis = new FileInputStream(f);
				DataInputStream dis = new DataInputStream(fis);
		) {
			boolean b = dis.readBoolean();
			int i = dis.readInt();
			String str = dis.readUTF();
			
			System.out.println("��ȡ������ֵ��" + b);
			System.out.println("��ȡ��������" + i);
			System.out.println("��ȡ���ַ�����" + str);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	private static void write(){
		File f = new File("d:/lol.txt");
		
		try (				
				FileOutputStream fos = new FileOutputStream(f);
				DataOutputStream dos = new DataOutputStream(fos);
		){
			dos.writeBoolean(true);
			dos.writeInt(300);
			dos.writeUTF("123 this is garen");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
