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
		//�θ�Ŭ������ ���ڰ� ���޵Ǵ� �����ڸ� ������ ���� ��������� �θ�Ŭ������ �����ڸ� ȣ���ؾ� ��
		super(b);
	}
}

public class SuperTest3 {
	public static void main(String[] args) {
				
	}
}
