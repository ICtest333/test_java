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
				System.out.print("������ �Է��ϼ���.(����:q/Q)");
				line = br.readLine();
				System.out.println("�Է��Ͻ� ���� : "+line);
			} while(!line.equalsIgnoreCase("q"));
			
			System.out.println("���α׷� ����!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//�ڿ����� 
			if(br!=null)try{br.close();}catch(IOException e){}
		}
	}

}