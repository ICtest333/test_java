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
		
		Z zp = in;//클래스타입 -> 인터페이스타입
		          //자동적 형변환
		
		zp.make();
//		zp.fun(); 호출범위를 벗어나 호출 불가능
				
		InterX in2 = (InterX)zp;//인터페이스타입 -> 클래스타입
		                        //명시적 형변환
		
		in2.make();
		in2.fun();
	}

}
