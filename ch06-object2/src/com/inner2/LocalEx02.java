package com.inner2;

class LocalInner2{
	int a = 100;//�������
	public void innerTest(){
		int b = 200;//��������
		final int c = 300;
		
		class Inner{
			public void getData() {
				System.out.println("a = " + a);
//				System.out.println("b = " + b); ���� ����Ŭ������ ��ġ�� �޼����� ���������� ȣ�� �Ұ���
				System.out.println("c = " + c);
			}
		}
		Inner i = new Inner();
		i.getData();
	}
}

public class LocalEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInner2 in = new LocalInner2();
		in.innerTest();
	}

}
