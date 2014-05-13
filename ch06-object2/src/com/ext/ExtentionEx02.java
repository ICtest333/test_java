package com.ext;

//부모클래스
class A extends Object{//extends Object 생략함
	int a = 100;
	public void make(){
		System.out.println("부모클래스");
	}
}
//자식클래스
class B extends A{
	int b = 200;
	public void fun(){
		System.out.println("자식클래스");
	}
}

public class ExtentionEx02 {
	public static void main(String[] args){
		B bp = new B();
		System.out.println(bp.a);
		System.out.println(bp.b);
		bp.make();
		bp.fun();
	}
}





