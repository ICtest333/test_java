public class ThisTest {
	
	public ThisTest(){
		System.out.println("按眉 积己 : " + this);
	}
	
	public static void main(String[] args){
		ThisTest tt = new ThisTest();
		System.out.println("按眉积己 饶 : " + tt);
	}
}
