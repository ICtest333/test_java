public class ForEx02 {
	public static void main(String[] args){
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		System.out.print("�� �Է�>");
		int dan = input.nextInt();
		
		System.out.println("===" + dan + "��===");
		
		for(int i=1;i<=9;i++){
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
	}
}
