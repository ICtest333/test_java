package com.ext2;

//�θ�Ŭ����
class A{
	public void make(){
		System.out.println("�θ�Ŭ����");
	}
}
class B extends A{
	
	public B(){
		super.make();
	}
	
	public void fun(){
		super.make();
	}
	
	@Override
	public void make(){ //�޼��� ������
		System.out.println("�ڽ�Ŭ����");
	}
}
public class SuperTest {
	public static void main(String[] args){
		B bp = new B();
		bp.make();
	}
}



