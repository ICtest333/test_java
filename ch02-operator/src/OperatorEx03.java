public class OperatorEx03 {
	public static void main(String[] args){
		
		System.out.println("===��������===");
		
		boolean a,b,result;
		a = true;
		b = false;
		
		//���� : �����ǰ� ������ ��� true�� ������� true
		result = a && b;
		System.out.println("a && b = " + result);
		
		//���� : ������ �Ǵ� ������ �� �ϳ��̻� true�� �������
		//         true
		result =  a || b;
		System.out.println("a || b = " + result);
		
		//���� : true�� false�� false�� true
		result = !a;
		System.out.println("!a = " + result);
		
	}
}




