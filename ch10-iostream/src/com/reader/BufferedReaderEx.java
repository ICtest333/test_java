package com.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		String line = "";
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
						
			do {
				System.out.print("문장을 입력하세요.(종료:q/Q)");
				line = br.readLine();
				System.out.println("입력하신 문장 : "+line);
			} while(!line.equalsIgnoreCase("q"));
			
			System.out.println("프로그램 종료!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//자원정리 
			if(br!=null)try{br.close();}catch(IOException e){}
		}
	}

}
