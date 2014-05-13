public class ArrayEx01 {
	public static void main(String[] args){
		char[] ch; //배열 선언
		ch = new char[4]; //배열 생성
		
		//배열 초기화
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		System.out.println(ch[0]);
		
		//반복문을 이용한 배열의 내용 출력
		for(int i=0;i<ch.length;i++){
			System.out.println("ch["+i+"]:"+ch[i]);
		}
		
		//배열 선언, 생성
		int it[] = new int[6];
		
		//배열 선언, 생성, 초기화(명시적 배열 생성)
		char[] ch2 = new char[]{'J','a','v','a'};
		
		//배열 선언, 생성, 초기화(암시적 배열 생성)
		char[] ch3 = {'자','바'};
		
	}
}




