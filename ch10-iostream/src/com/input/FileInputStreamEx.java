package com.input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		int readbyte = 0;
		byte[] readArray;
		
		try {
			fis = new FileInputStream("file.txt");
			
			//������ ������ �� ���ھ� �о�鿩 �ƽ�Ű�ڵ��
			//��ȯ, �����̿��� ���ڴ� ����
			/*while((readbyte = fis.read()) != -1){
				System.out.print((char)readbyte);
			}*/
			
			//���� �̿��� ���ڵ� ó�� ����
			readArray = new byte[fis.available()];
			fis.read(readArray);
			
			System.out.println(new String(readArray));//byte[] -> String
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}finally{
			//�ڿ� ����
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}

}