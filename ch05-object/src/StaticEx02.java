public class StaticEx02 {
	String s1 = "static";//인스턴스 변수
	static String s2 = "STATIC";//static 변수
	
	public static String getString(){
		return s2;
	}
	
	public static void main(String[] args){
		//인스턴스 변수는 객체 생성 후 호출해야 함
		//System.out.println(s1);
		
		//static 변수는 호출하면 메모리에 올라가기 때문에
		//객체 생성 없이 호출 가능
		System.out.println(s2);
		
		System.out.println(getString());
		
	}
}



