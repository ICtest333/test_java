package com.serial;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== ��ü ����ȭ �ϱ� ===");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		//����ȭ�� ��ü ����
		Customer c = new Customer("ȫ�浿");
		
		try {
			fos = new FileOutputStream("object.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(c);//��ü ����ȭ ����
			
			System.out.println("��ü ����ȭ �Ϸ�");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if(oos!=null)try{oos.close();}catch(IOException e){}
			if(fos!=null)try{fos.close();}catch(IOException e){}			
		}
		
	}

}

