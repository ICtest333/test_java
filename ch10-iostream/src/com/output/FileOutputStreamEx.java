package com.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("fileout.txt");
			
			String message = "Hello File!! ���Ͽ� ���� ���";
			
			fos.write(message.getBytes());
			
			System.out.println("������ �����ϰ� ������ ����߽��ϴ�.");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//�ڿ�����
			if(fos != null)try{fos.close();}catch(IOException e){}
			}
		}
	}

