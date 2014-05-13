package com.inner2;

class LocalInner2{
	int a = 100;//멤버변수
	public void innerTest(){
		int b = 200;//지역변수
		final int c = 300;
		
		class Inner{
			public void getData() {
				System.out.println("a = " + a);
//				System.out.println("b = " + b); 로컬 내부클래스가 위치한 메서드의 지역변수는 호출 불가능
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
