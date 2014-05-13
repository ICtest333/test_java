public class ThisTest3 {
	
	public ThisTest3(){
		//this() 위에 수행문을 명시하면 오류 발생
		/*System.out.println(
		"인자가 없는 생성자를 이용한 객체 생성!!");*/
		this("바람");
		System.out.println(
	          "인자가 없는 생성자를 이용한 객체 생성!!");
	}
	public ThisTest3(int n){
		          //int -> String
		this(String.valueOf(n));
		
	}
	public ThisTest3(String msg){
		System.out.println(msg);
	}
	
	public static void main(String[] args){
		ThisTest3 tt = new ThisTest3();
		System.out.println("==========");
		ThisTest3 tt2 = new ThisTest3(1000);
		
	}
}




