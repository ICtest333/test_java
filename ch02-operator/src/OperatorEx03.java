public class OperatorEx03 {
	public static void main(String[] args){
		
		System.out.println("===논리연산자===");
		
		boolean a,b,result;
		a = true;
		b = false;
		
		//논리곱 : 선조건과 후조건 모두 true면 결과값이 true
		result = a && b;
		System.out.println("a && b = " + result);
		
		//논리합 : 선조건 또는 후조건 중 하나이상 true면 결과값이
		//         true
		result =  a || b;
		System.out.println("a || b = " + result);
		
		//부정 : true를 false로 false를 true
		result = !a;
		System.out.println("!a = " + result);
		
	}
}




