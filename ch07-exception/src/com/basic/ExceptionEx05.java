package com.basic;

public class ExceptionEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== ���ܰ� �߻����� ���� ��� ===");
		
		try{
			System.out.println("1");
		}catch(Exception e){
			System.out.println("2");
		}finally{
			System.out.println("3");
		}
		System.out.println("4");
		
		System.out.println("=== ���ܰ� �߻��� ��� ===");
		
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
