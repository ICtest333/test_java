package com.finalex;

//class에 final을 지정하면 상속 불가능
final class Me2{
	int a = 100;
}

/*class MeEx2 extends Me2{
	int b = 200;
}*/

class MeEx2{
	int b = 200;
}

public class FinalEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MeEx2 me = new MeEx2();
	}

}
