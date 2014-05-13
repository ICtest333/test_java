package com.ext2;

class Parent2{
	int msg = 10;
	
	public Parent2(){
		super(); //obhect의 default 생성자 호출
	}
}

class Child2 extends Parent2{
	int str = 20;
	public Child2(){
		super(); // 암묵적으로 부모클래스의  default 생성자 호출
	}
}

public class SuperTest2 {
	public static void main(String[] args)
	{
		Child2 ch = new Child2();
		System.out.println(ch);
	}
}
