public class OverloadingTest {
	//메서드 오버로딩: 기능이 같을 때 메서드 이름을 동일하게
	//명시하고 전달되는 인자의 타입 또는 인자의 갯수, 
	//타입의 순서를 다르게 처리하는 기법
	public void getLength(int n){
		           //int -> String
		String s = String.valueOf(n);
		getLength(s);
	}
	public void getLength(float n){
		           //float -> String
		String s = String.valueOf(n);
		getLength(s);
	}
	public void getLength(String str){
		System.out.println(
			"입력한 값의 길이 : " + str.length());
	}
	
	public static void main(String[] args){
		OverloadingTest ot = new OverloadingTest();
		ot.getLength(1000);//1000->"1000"
		ot.getLength(3.14f);//3.14f -> "3.14"
		ot.getLength("월드컵");//"월드컵"
	}
}
