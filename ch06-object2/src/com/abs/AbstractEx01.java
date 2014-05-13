package com.abs;

//추상클래스
abstract class A{
	int a;
	
	public void setA(int a){
		this.a = a;
	}
}

class B extends A{//추상클래스는 부모클래스 역할 가능
	int b = 200;
	
	
}

public class AbstractEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상클래스는 객체 생성 불가능
		//A ap = new A();
		B bp = new B();
		

	}

}
