public class ContinueEx {
	public static void main(String[] args){
		for(int i=0;i<=10;i++){
			
			//특정 조건일 때 코드 수행을 다음 반복 회차로 건너뜀
			if(i%3==0) //3의 배수
				continue;
			
			System.out.println(i);
		}
	}
}
