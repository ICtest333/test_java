package com.inner4;

class Inner7{
	public void disp() {
		System.out.println("Inner7's disp");
	}
}

public class AnonymousEx02 {
	
	public void innerTest(){
		//익명 내부클래스
		Inner7 i = new Inner7(){
			@Override
			public void disp() {
				System.out.println("익명 내부클래스의 disp");
			}
		};
		i.disp();	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousEx02 an = new AnonymousEx02();
		an.innerTest();
	}

}
