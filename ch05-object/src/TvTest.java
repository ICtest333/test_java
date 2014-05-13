class Tv{
	//멤버변수(속성)
	String color;//색상
	boolean power;//전원상태
	int channel;//채널
	
	//멤버메서드(동작)
	public void power(){
		power = !power;
	}
	public void channelUp(){
		++channel;
		return;//일반적으로 생략
	}
	public void channelDown(){
		--channel;
	}
}
public class TvTest {
	public static void main(String[] args){
		Tv t = new Tv();
		t.power(); //false -> true
		System.out.println("Tv 실행 여부 : " + t.power);
		
		t.channel = 7; //채널 할당
		System.out.println("현재 채널 : " + t.channel);
		
		t.channelDown(); //채널 변경
		System.out.println("변경된 채널 : " + t.channel);
		
		t.power(); //true -> false
		System.out.println("Tv 실행 여부 : " + t.power);
	}
}




