public class OverloadingTest {
	//�޼��� �����ε�: ����� ���� �� �޼��� �̸��� �����ϰ�
	//����ϰ� ���޵Ǵ� ������ Ÿ�� �Ǵ� ������ ����, 
	//Ÿ���� ������ �ٸ��� ó���ϴ� ���
	public void getLength(int n){
		           //int -> String
		String s = String.valueOf(n);
		getLength(s);
	}
	public void getLength(float n){
		           //float -> String
		String s = String.valueOf(n);
		getLength(s);
	}
	public void getLength(String str){
		System.out.println(
			"�Է��� ���� ���� : " + str.length());
	}
	
	public static void main(String[] args){
		OverloadingTest ot = new OverloadingTest();
		ot.getLength(1000);//1000->"1000"
		ot.getLength(3.14f);//3.14f -> "3.14"
		ot.getLength("������");//"������"
	}
}
