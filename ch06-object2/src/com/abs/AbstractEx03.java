package com.abs;

abstract class A2{
	public abstract int getA();
	public int getB() {
		return 20;
	}
}

abstract class B2 extends A2{
	public abstract int getC();
	public int getD() {
		return 40;
		
	}
}

class C2 extends B2{
	@Override
	public int getA() {
		return 10;
	}
	
	@Override
	public int getC() {
		return 30;
	}
}

public class AbstractEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 cp = new C2();

	}

}
