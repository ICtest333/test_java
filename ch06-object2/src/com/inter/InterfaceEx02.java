package com.inter;

//interface�� ���, �߻�޼ҵ�� ����
interface A2{
	//����޼ҵ�
	public abstract void abc();
	void edf();//�߻�޼ҵ� {}�� ����. abstract �տ� ����
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
