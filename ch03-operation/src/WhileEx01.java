public class WhileEx01 {
	public static void main(String[] args){
		int sum,su;
		sum = su = 0;//초기식
		
		while(su<=100){//조건식
			sum += su;
			su++;//증감식
		}
		System.out.println("1~100 합 : " + sum);
	}
}
