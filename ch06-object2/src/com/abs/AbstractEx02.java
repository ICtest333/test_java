package com.abs;

abstract class Parent{
	int a = 100;
	
	public abstract void abc();//�߻�޼ҵ�
	public void setA(int a){
		this.a = a;
	}
}

class Child extends Parent{
	@Override
	public void abc(){ //�߻�޼ҵ�� �ݵ�� �ڽ�Ŭ�������� �����Ǿ�� ��
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
