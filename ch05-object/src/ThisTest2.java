public class ThisTest2 {
	int a;
	
	//���������� ������������ ������ ��
	//������ �Ǵ� �޼��峻������ ������������
	//�켱
	public ThisTest2(int a){
     //�������   ��������
		this.a = a;
	}

	public static void main(String[] args){
		ThisTest2 tt = new ThisTest2(10);
		System.out.println(tt.a);
	}
}
