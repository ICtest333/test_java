package com.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		try {
			fw = new FileWriter("fileWriter.txt");
			
			String message = "�ȳ��ϼ��� FileWriter �׽�Ʈ";
			fw.write(message);
//			fw.flush();
			
			System.out.println("���� ���� �� ���� ���");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw!=null)try{fw.close();}catch(IOException e){}
		}
	}

}