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
			
			String str = "BufferedOutputStream Test 입니다.";
			bos.write(str.getBytes());//버퍼 내용 기술
//			bos.flush();//버퍼의 내용을 파일에 기술하고 버퍼를 비움
			
			System.out.println("파일 생성 및 내용 기술");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//자원정리
			//BufferedOutputStream의 close()는 자원정리하기
			//전에 buffer에 데이터가 있는지 여부를 먼저 확인한 후
			//데이터가 있으면 flush한 후 자원정리함
			if(bos!=null)try{bos.close();}catch(IOException e){}
			if(fos!=null)try{fos.close();}catch(IOException e){}
		}
	}

}
