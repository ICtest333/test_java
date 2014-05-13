package com.inter;

interface Inter1{
	public int getA();
	
}

interface Inter2{
	public abstract int getB();
}
//인터페이스간 상속
interface Inter3 extends Inter1, Inter2{
	public abstract int getData();
}

interface Inter4{
	public abstract int getC();
}

public class InterfaceEx03 implements Inter3, Inter4{
	
	@Override
	public int getA() {
	
		return 10;
	}
	
	@Override
	public int getB() {
	
		return 20;
	}
	
	@Override
	public int getData() {
	
		return 30;
	}
	
	@Override
	public int getC() {
	
		return 40;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEx03 in = new InterfaceEx03();
		
		

	}

}
