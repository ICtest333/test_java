package com.ext;

//부모클래스
class Parent{
	int a = 100;
}
//자식클래스
class Child extends Parent{
	int b = 200;
}

public class ExtentionEx01 {
	public static void main(String[] args){
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
	}
}
