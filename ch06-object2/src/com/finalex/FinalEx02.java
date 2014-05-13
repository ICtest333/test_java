package com.finalex;

class Me{
	int a = 100;
	//매서드에 final를 기재하면 자식클래스에서 매서드 재정의가 불가능
	public final void make(){
		System.out.println("Me의 make");
	}
}

class MeEx extends Me{
	
/*	@Override
	public void make(){//매서드 오버라이드(재정의)
		System.out.println("MeEx의 make");
	}*/
}

public class FinalEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeEx me = new MeEx();
		me.make();

	}

}
