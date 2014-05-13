package com.output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("bufferout.txt");
			bos = new BufferedOutputStream(fos);
			
			String str = "BufferedOutputStream Test �Դϴ�.";
			bos.write(str.getBytes());//���� ���� ���
//			bos.flush();//������ ������ ���Ͽ� ����ϰ� ���۸� ���
			
			System.out.println("���� ���� �� ���� ���");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//�ڿ�����
			//BufferedOutputStream�� close()�� �ڿ������ϱ�
			//���� buffer�� �����Ͱ� �ִ��� ���θ� ���� Ȯ���� ��
			//�����Ͱ� ������ flush�� �� �ڿ�������
			if(bos!=null)try{bos.close();}catch(IOException e){}
			if(fos!=null)try{fos.close();}catch(IOException e){}
		}
	}

}