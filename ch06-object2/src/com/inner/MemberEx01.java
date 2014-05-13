package com.inner;

class Outer{
	int x = 100;
	
	//멤버 내부클래스
	class Inner{
		int y = 200;
	}
}

public class MemberEx01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer ot = new Outer();
		Outer.Inner oi = ot.new Inner();//멤버 내부클래스 객체 생성 방법
		
		System.out.println("x = "+ot.x);
		System.out.println("y = "+oi.y);
	}

}
