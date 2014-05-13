public class BreakEx01 {
	public static void main(String[] args){
		int n = 1;//초기식
		while(n<=10){//조건식
			
			//break : 특정 조건일 때 반복문을 빠져나가는 역할
			if(n==8)
				break;
			
			System.out.println(n);
			n++;//증감식
		}
	}
}
