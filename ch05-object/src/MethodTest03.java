public class MethodTest03 {
	//인자전달 방식
	//Variable Arguements : 메서드에 데이터를 전달할 때
	//                      타입은 일치하면서 인자의 
	//                      갯수를 다르게 데이터 전달이
	//                      가능하게 하는 방식
	//                      JDK5.0이상부터 사용 가능
	
	public void argTest(int ... n){
		for(int i=0;i<n.length;i++){
			System.out.println("n["+i+"]:"+n[i]);
		}
		System.out.println("---------");
	}
	
	public static void main(String[] args){
		MethodTest03 m = new MethodTest03();
		m.argTest();
		m.argTest(5);
		m.argTest(5,6);
		m.argTest(5,6,7);
	}
}
