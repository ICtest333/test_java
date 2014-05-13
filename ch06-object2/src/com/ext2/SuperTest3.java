package com.ext2;

class A2{
	int a;
	
	public A2(int a) {
		// TODO Auto-generated constructor stub
		this.a=a;
	}
}

class B2 extends A2{
	int b = 200;
	
	public B2(int b) {
		// TODO Auto-generated constructor stub
		//부모클래스에 인자가 전달되는 생성자만 존재할 경우는 명시적으로 부모클래스에 생성자를 호출해야 함
		super(b);
	}
}

public class SuperTest3 {
	public static void main(String[] args) {
				
	}
}
