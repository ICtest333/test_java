package com.inter;

interface A1{
	//���
	public static final int W = 10;
	int X = 20;
	static int Y = 30;
	final int Z = 40;
	
	
}

public class InterfaceEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A1 ap = new A1(); �������̽��� ��ü ���� �Ұ�
		System.out.println("W = "+ A1.W);
		System.out.println("X = "+ A1.X);
		System.out.println("Y = "+ A1.Y);
		System.out.println("Z = "+ A1.Z);
	}

}
