package com.basic;

public class ExceptionEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== 예외가 발생하지 않은 경우 ===");
		
		try{
			System.out.println("1");
		}catch(Exception e){
			System.out.println("2");
		}finally{
			System.out.println("3");
		}
		System.out.println("4");
		
		System.out.println("=== 예외가 발생한 경우 ===");
		
		try{
			System.out.println("1");
			System.out.println(50/0);
			System.out.println("2");
		}catch(Exception e){
			System.out.println("3");
		}finally{
			System.out.println("4");
		}
		System.out.println("5");
	}

}
