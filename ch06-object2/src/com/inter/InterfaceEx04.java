package com.inter;

interface Z{
	public abstract void make();
}

class InterX implements Z{
	@Override
	public void make() {
		System.out.println("make method");
		
	}
	
	public void fun(){
		System.out.println("fun method");
	}
}

public class InterfaceEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterX in = new InterX();
		in.make();
		in.fun();
		
		Z zp = in;//Ŭ����Ÿ�� -> �������̽�Ÿ��
		          //�ڵ��� ����ȯ
		
		zp.make();
//		zp.fun(); ȣ������� ��� ȣ�� �Ұ���
				
		InterX in2 = (InterX)zp;//�������̽�Ÿ�� -> Ŭ����Ÿ��
		                        //����� ����ȯ
		
		in2.make();
		in2.fun();
	}

}
