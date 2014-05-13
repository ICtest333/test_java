public class OperatorEx01 {
	public static void main(String[] args){
		System.out.println("===증감연산자===");
		System.out.println("[증가연산자]");
		int i = 5;
		//증가연산자 선행
		System.out.println(++i);
		//증가연산자 후행
		System.out.println(i++);
		System.out.println(i);
		
		System.out.println("[감소연산자]");
		int j = 10;
		//감소연산자 선행
		System.out.println(--j);
		//감소연산자 후행
		System.out.println(j--);
		System.out.println(j);
	}
}
