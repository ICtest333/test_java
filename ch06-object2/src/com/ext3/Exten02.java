package com.ext3;

class A{
	public void play(){
		System.out.println("play method");
	}
	
	public void make(){
		System.out.println("Parent class make");
	}
}

class B extends A{
	public void fun(){
		System.out.println("fun method");
	}
	
	@Override
	public void make(){
		System.out.println("Child class make");
	}
}

public class Exten02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B bp = new B();
		
		bp.play();
		bp.fun();
		bp.make();
		
		A ap = bp;//�ڽ�Ŭ����Ÿ�� -> �θ�Ŭ����Ÿ��
		          //��ĳ����, �ڵ������� ����ȯ
		System.out.println("===============");
		ap.play();
		//ap.fun(); ȣ�� ������ ��� ȣ�� �Ұ���
		ap.make();
	}

}
