package com.finalex;

public class FinalEx01 {
	int a;//��� ����
	final int NUM = 10; //���
	public static final int VAR = 200; //static ���

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER = 300; //�������
		System.out.println(NUMBER);
		
		FinalEx01 f = new FinalEx01();
		//f.NUM = 600; ����� ���� �Ұ���
		System.out.println(f.NUM);
		
		//static ��� ȣ��
//		System.out.println(FinalEx01.VAR); Ŭ������ �ȳ־ �������� ����ϴ°� ����
		System.out.println(VAR);
	}

}
