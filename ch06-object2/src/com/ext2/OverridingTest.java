package com.ext2;

//�θ�Ŭ����
class Parent{
	public void play(){
		System.out.println("�θ�Ŭ����");
	}
}
//�ڽ�Ŭ����
class Child extends Parent{
	//�޼��� �������̵�(�޼��� ������)
	//@Override ������̼� : �޼��� �����ǰ� ��Ȯ�ϰ�
	//                      ǥ��ƴ��� ���θ� �������ִ�
	//                      ������̼�
	//                      JDK5.0�̻󿡼� ��� ����
	@Override
	public void play(){
		System.out.println("�ڽ�Ŭ����");
	}
}

public class OverridingTest {
	public static void main(String[] args){
		Child ch = new Child();
		ch.play();
	}
}




