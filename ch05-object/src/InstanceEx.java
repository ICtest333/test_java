public class InstanceEx {
	//멤버필드
	int var1; //변수
	final int NUM=9;//상수
	
	//생성자
	public InstanceEx(){}
	
	//멤버메서드
	public int sum(int a, int b){
		return a+b;
	}
	
	public static void main(String[] args){
		//객체 선언
		InstanceEx in;
		//객체 생성
		in = new InstanceEx();
		
		//멤버 변수 호출
		System.out.println(in.var1);
		
		in.var1 = 20;
		System.out.println(in.var1);
		
		//멤버 상수 호출
		//상수는 변경 불가능
		//in.NUM = 10;
		System.out.println(in.NUM);
		
		//멤버 메서드 호출
		int result = in.sum(5, 10);
		System.out.println("result = " + result);
	}
}
