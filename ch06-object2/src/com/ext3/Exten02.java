package com.ext3;

class A{
	public void play(){
		System.out.println("play method");
	}
	
	public void make(){
		System.out.println("Parent class make");
	}
}

class B extends A{
	public void fun(){
		System.out.println("fun method");
	}
	
	@Override
	public void make(){
		System.out.println("Child class make");
	}
}

public class Exten02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B bp = new B();
		
		bp.play();
		bp.fun();
		bp.make();
		
		A ap = bp;//자식클래스타입 -> 부모클래스타입
		          //업캐스팅, 자동적으로 형변환
		System.out.println("===============");
		ap.play();
		//ap.fun(); 호출 범위를 벗어나 호출 불가능
		ap.make();
	}

}
