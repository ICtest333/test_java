package com.abs;

abstract class Parent{
	int a = 100;
	
	public abstract void abc();//추상메소드
	public void setA(int a){
		this.a = a;
	}
}

class Child extends Parent{
	@Override
	public void abc(){ //추상메소드는 반드시 자식클래스에서 구현되어야 함
		System.out.println("abc method");
	}
}

public class AbstractEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		
		ch.abc();

	}

}
