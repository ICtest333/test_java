package com.ext3;

class Parent{
	int a = 100;
}

class Child extends Parent{
	int b = 200;
}

public class Exten01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		Parent p = ch;//�ڽ�Ŭ����Ÿ�� -> �θ�Ŭ����Ÿ��
		              //��ĳ����, �ڵ������� ����ȯ
					  //����ȯ - ȣ�� ������ ��ȯ
		
		System.out.println(p.a);
//		System.out.println(p.b); ȣ������� ��� ȣ�� �Ұ���
		
		Child ch2 = (Child)p;//�θ�Ŭ����Ÿ�� -> �ڽ�Ŭ����Ÿ��
		                     //�ٿ�ĳ����, ��������� ����ȯ
		System.out.println(ch2.a);
		System.out.println(ch2.b);
		
	}

}
