public class SwitchEx02 {
	public static void main(String[] args){
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		int first = 0, second = 0, total = 0;
		String opt;
		
		System.out.print("ù��° ��>");
		first = input.nextInt();
		
		System.out.print("�ι�° ��>");
		second = input.nextInt();
		
		System.out.print("������>");
		opt = input.next();
		
		//���ڰ��� ���ڿ��� ��� : JDK7.0�̻󿡼��� ����
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
			System.out.println("�߸��� ������ �Է�!!");
			//���α׷� ����
			System.exit(0);
		}
		
		System.out.println(); //�ܼ� �ٹٲ�
		System.out.println(
		first + " " + opt + " " + second + " = " + total);
		
	}
}




