package com.ext2;

class Parent2{
	int msg = 10;
	
	public Parent2(){
		super(); //obhect�� default ������ ȣ��
	}
}

class Child2 extends Parent2{
	int str = 20;
	public Child2(){
		super(); // �Ϲ������� �θ�Ŭ������  default ������ ȣ��
	}
}

public class SuperTest2 {
	public static void main(String[] args)
	{
		Child2 ch = new Child2();
		System.out.println(ch);
	}
}
