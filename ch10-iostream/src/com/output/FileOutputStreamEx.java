package com.output;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("fileout.txt");
			
			String message = "Hello File!! 파일에 내용 기술";
			
			fos.write(message.getBytes());
			
			System.out.println("파일을 생성하고 내용을 기술했습니다.");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			//자원정리
			if(fos != null)try{fos.close();}catch(IOException e){}
			}
		}
	}


