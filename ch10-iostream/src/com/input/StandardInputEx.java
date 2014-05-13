package com.input;

import java.io.IOException;

public class StandardInputEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int input = 0;
			
			while((input=System.in.read()) != -1){
				System.out.println("input : "+input+", (char)input : "+(char)input);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
