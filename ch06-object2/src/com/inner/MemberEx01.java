package com.inner;

class Outer{
	int x = 100;
	
	//��� ����Ŭ����
	class Inner{
		int y = 200;
	}
}

public class MemberEx01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer ot = new Outer();
		Outer.Inner oi = ot.new Inner();//��� ����Ŭ���� ��ü ���� ���
		
		System.out.println("x = "+ot.x);
		System.out.println("y = "+oi.y);
	}

}
