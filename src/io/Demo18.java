package io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo18 {
    /**
    *
    * @param decodingFile
    *            �����ܵ��ļ�
    * @param decodedFile
    *            ���ܺ󱣴��λ��
    */
   public static void decodeFile(File decodingFile, File decodedFile) {

       try (FileReader fr = new FileReader(decodingFile); FileWriter fw = new FileWriter(decodedFile)) {
           // ��ȡԴ�ļ�
           char[] fileContent = new char[(int) decodingFile.length()];
           fr.read(fileContent);
           System.out.println("Դ�ļ�������:");
           System.out.println(new String(fileContent));
           // ���н���
           decode(fileContent);
           System.out.println("���ܺ������:");
           System.out.println(new String(fileContent));
           // �ѽ��ܺ�����ݱ��浽Ŀ���ļ�
           fw.write(fileContent);
       } catch (IOException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
   }

   private static void decode(char[] fileContent) {
       for (int i = 0; i < fileContent.length; i++) {
           char c = fileContent[i];
           if (isLetterOrDigit(c)) {
               switch (c) {
               case '0':
                   c = '9';
                   break;
               case 'a':
                   c = 'z';
                   break;
               case 'A':
                   c = 'Z';
                   break;
               default:
                   c--;
                   break;
               }
           }
           fileContent[i] = c;
       }
   }

   public static boolean isLetterOrDigit(char c) {
       // ��ʹ��Character���isLetterOrDigit��������Ϊ������Ҳ�ᱻ�ж�Ϊ��ĸ
       String letterOrDigital ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
       return -1 == letterOrDigital.indexOf(c) ? false : true;
   }

   public static void main(String[] args) {
       File decodingFile = new File("E:/project/j2se/src/Test2.txt");
       File decodedFile = new File("E:/project/j2se/src/Test1.txt");

       decodeFile(decodingFile, decodedFile);

   }
}
