public class ThisTest2 {
	int a;
	
	//멤버변수명과 지역변수명이 동일할 때
	//생성자 또는 메서드내에서는 지역변수명이
	//우선
	public ThisTest2(int a){
     //멤버변수   지역변수
		this.a = a;
	}

	public static void main(String[] args){
		ThisTest2 tt = new ThisTest2(10);
		System.out.println(tt.a);
	}
}
