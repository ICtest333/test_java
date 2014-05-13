public class SwitchEx01 {
	public static void main(String[] args){
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		System.out.print("정수형 숫자 입력>");
		int a = input.nextInt();
		
		//인자값 : long을 제외한 정수형(byte,short,int),char
		switch(a){
		case 1:
			System.out.println("하나!!");
			break;
		case 2:
			System.out.println("둘!!");
			break;
		case 3:
			System.out.println("셋!!");
			break;
		default:
			System.out.println("하나,둘,셋이 아닙니다!!");
		}
	}
}
