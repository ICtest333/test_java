public class SwitchEx01 {
	public static void main(String[] args){
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		System.out.print("������ ���� �Է�>");
		int a = input.nextInt();
		
		//���ڰ� : long�� ������ ������(byte,short,int),char
		switch(a){
		case 1:
			System.out.println("�ϳ�!!");
			break;
		case 2:
			System.out.println("��!!");
			break;
		case 3:
			System.out.println("��!!");
			break;
		default:
			System.out.println("�ϳ�,��,���� �ƴմϴ�!!");
		}
	}
}
