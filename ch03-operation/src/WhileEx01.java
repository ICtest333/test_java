public class WhileEx01 {
	public static void main(String[] args){
		int sum,su;
		sum = su = 0;//�ʱ��
		
		while(su<=100){//���ǽ�
			sum += su;
			su++;//������
		}
		System.out.println("1~100 �� : " + sum);
	}
}