public class SwitchEx02 {
	public static void main(String[] args){
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		int first = 0, second = 0, total = 0;
		String opt;
		
		System.out.print("첫번째 수>");
		first = input.nextInt();
		
		System.out.print("두번째 수>");
		second = input.nextInt();
		
		System.out.print("연산자>");
		opt = input.next();
		
		//인자값이 문자열인 경우 : JDK7.0이상에서만 가능
		switch(opt){
		case "+":
			total = first + second;break;
		case "-":
			total = first - second;break;
		case "*":
			total = first * second;break;
		case "/":
			total = first / second;break;
		case "%":
			total = first % second;break;
		default:
			System.out.println("잘못된 연산자 입력!!");
			//프로그램 종료
			System.exit(0);
		}
		
		System.out.println(); //단순 줄바꿈
		System.out.println(
		first + " " + opt + " " + second + " = " + total);
		
	}
}




