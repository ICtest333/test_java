package com.finalex;

public class FinalEx01 {
	int a;//멤버 변수
	final int NUM = 10; //상수
	public static final int VAR = 200; //static 상수

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER = 300; //지역상수
		System.out.println(NUMBER);
		
		FinalEx01 f = new FinalEx01();
		//f.NUM = 600; 상수는 변경 불가능
		System.out.println(f.NUM);
		
		//static 상수 호출
//		System.out.println(FinalEx01.VAR); 클래스를 안넣어도 괜찬으나 명시하는게 좋다
		System.out.println(VAR);
	}

}
