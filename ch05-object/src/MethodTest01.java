public class MethodTest01 {
	
	//인자전달 방식
	//값 호출(Call by Value)
	
	//멤버메서드
	public int increase(int n){
		++n;
		return n;
	}
	
	public static void main(String[] args){
		int var1 = 100;
		
		MethodTest01 m = new MethodTest01();
		int var2 = m.increase(var1);
		
		System.out.println("var1 : " + var1 +","+
				           "var2 : " + var2);
	}
}
