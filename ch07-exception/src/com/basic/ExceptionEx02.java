package com.basic;

public class ExceptionEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] var = {10,20,30};
		
		for(int i=0;i<=3;i++){
			try{
				//예외가 발생할 가능성이 있는 코드
				System.out.println("var["+i+"]:"+var[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("없는 인덱스 호출");
			}
		}
		System.out.println("프로그램 끝!");
		

	}

}
