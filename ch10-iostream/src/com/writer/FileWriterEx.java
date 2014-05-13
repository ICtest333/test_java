package com.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		try {
			fw = new FileWriter("fileWriter.txt");
			
			String message = "안녕하세요 FileWriter 테스트";
			fw.write(message);
//			fw.flush();
			
			System.out.println("파일 생성 및 내용 기술");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fw!=null)try{fw.close();}catch(IOException e){}
		}
	}

}
