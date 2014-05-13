package com.inner4;

class Inner6{
	public void disp() {
		System.out.println("Inner6's disp");
	}
}

public class AnonymousEx01 {
	
	public void innerTest(){
		
		class Inner extends Inner6{
			
			@Override
			public void disp() {
				System.out.println("재정의된 disp");
				
			}
		}
		
		Inner i = new Inner();
		i.disp();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousEx01 a = new AnonymousEx01();
		a.innerTest();
	}

}
