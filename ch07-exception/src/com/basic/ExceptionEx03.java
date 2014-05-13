package com.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ExceptionEx03 {
	
	private void printData() throws IOException, NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("�� �Է� > ");
                //String -> int
		int dan = Integer.parseInt(br.readLine());
		System.out.println(dan+"��");
		System.out.println("============");
		
		for(int i=0;i<=9;i++){
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionEx03 ex = new ExceptionEx03();
		try{
			ex.printData();
		}catch(Exception e){
			System.out.println("������ �߻��߽��ϴ�.");
		}
		
	}

}
