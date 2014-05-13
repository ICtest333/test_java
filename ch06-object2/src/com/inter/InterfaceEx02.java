package com.inter;

//interface는 상수, 추상메소드로 구성
interface A2{
	//츠상메소드
	public abstract void abc();
	void edf();//추상메소드 {}가 없다. abstract 앞에 생략
}

class B2 implements A2{
	@Override
	public void abc() {
		System.out.println("abc method");
		
	}
	
	@Override
	public void edf() {
		System.out.println("edf method");
		
	}
}

public class InterfaceEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 bp = new B2();
		
		bp.abc();
		bp.edf();
	}

}
