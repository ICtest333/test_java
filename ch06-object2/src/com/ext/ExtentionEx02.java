package com.ext;

//�θ�Ŭ����
class A extends Object{//extends Object ������
	int a = 100;
	public void make(){
		System.out.println("�θ�Ŭ����");
	}
}
//�ڽ�Ŭ����
class B extends A{
	int b = 200;
	public void fun(){
		System.out.println("�ڽ�Ŭ����");
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





