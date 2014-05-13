package com.inner;

class Outer2{
	int x = 100;
	
	//멤버 내부클래스
	class Inner2{
		int y = 300;
		
		public void getData(){
			System.out.println("x = "+ x);
			System.out.println("y = "+ y);
		}
	}
}

public class MemberEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer2 ot2 = new Outer2();
		Outer2.Inner2 oi = ot2.new Inner2();
		
		oi.getData();
	}

}
