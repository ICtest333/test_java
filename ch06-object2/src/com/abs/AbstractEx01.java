package com.abs;

//�߻�Ŭ����
abstract class A{
	int a;
	
	public void setA(int a){
		this.a = a;
	}
}

class B extends A{//�߻�Ŭ������ �θ�Ŭ���� ���� ����
	int b = 200;
	
	
}

public class AbstractEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�߻�Ŭ������ ��ü ���� �Ұ���
		//A ap = new A();
		B bp = new B();
		

	}

}
