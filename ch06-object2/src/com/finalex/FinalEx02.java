package com.finalex;

class Me{
	int a = 100;
	//�ż��忡 final�� �����ϸ� �ڽ�Ŭ�������� �ż��� �����ǰ� �Ұ���
	public final void make(){
		System.out.println("Me�� make");
	}
}

class MeEx extends Me{
	
/*	@Override
	public void make(){//�ż��� �������̵�(������)
		System.out.println("MeEx�� make");
	}*/
}

public class FinalEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeEx me = new MeEx();
		me.make();

	}

}
