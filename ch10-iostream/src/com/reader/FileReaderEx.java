package com.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		int readChar = 0;
		try {
			fr = new FileReader("file.txt");
			//���Ϸκ��� �����͸� �� ���ھ� �о�鿩 �����ڵ�� ��ȯ
			
			while((readChar=fr.read())!=-1){
				System.out.print((char)readChar);
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fr!=null)try{fr.close();}catch(IOException e){}
		}
	}

}
