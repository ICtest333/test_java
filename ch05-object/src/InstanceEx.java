public class InstanceEx {
	//����ʵ�
	int var1; //����
	final int NUM=9;//���
	
	//������
	public InstanceEx(){}
	
	//����޼���
	public int sum(int a, int b){
		return a+b;
	}
	
	public static void main(String[] args){
		//��ü ����
		InstanceEx in;
		//��ü ����
		in = new InstanceEx();
		
		//��� ���� ȣ��
		System.out.println(in.var1);
		
		in.var1 = 20;
		System.out.println(in.var1);
		
		//��� ��� ȣ��
		//����� ���� �Ұ���
		//in.NUM = 10;
		System.out.println(in.NUM);
		
		//��� �޼��� ȣ��
		int result = in.sum(5, 10);
		System.out.println("result = " + result);
	}
}
