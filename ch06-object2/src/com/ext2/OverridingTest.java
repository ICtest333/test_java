package com.ext2;

//부모클래스
class Parent{
	public void play(){
		System.out.println("부모클래스");
	}
}
//자식클래스
class Child extends Parent{
	//메서드 오버라이딩(메서드 재정의)
	//@Override 어노테이션 : 메서드 재정의가 정확하게
	//                      표기됐는지 여부를 검증해주는
	//                      어노테이션
	//                      JDK5.0이상에서 사용 가능
	@Override
	public void play(){
		System.out.println("자식클래스");
	}
}

public class OverridingTest {
	public static void main(String[] args){
		Child ch = new Child();
		ch.play();
	}
}




