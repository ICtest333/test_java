package com.ext2;

//부모클래스
class A{
	public void make(){
		System.out.println("부모클래스");
	}
}
class B extends A{
	
	public B(){
		super.make();
	}
	
	public void fun(){
		super.make();
	}
	
	@Override
	public void make(){ //메서드 재정의
		System.out.println("자식클래스");
	}
}
public class SuperTest {
	public static void main(String[] args){
		B bp = new B();
		bp.make();
	}
}



