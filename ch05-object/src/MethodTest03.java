public class MethodTest03 {
	//�������� ���
	//Variable Arguements : �޼��忡 �����͸� ������ ��
	//                      Ÿ���� ��ġ�ϸ鼭 ������ 
	//                      ������ �ٸ��� ������ ������
	//                      �����ϰ� �ϴ� ���
	//                      JDK5.0�̻���� ��� ����
	
	public void argTest(int ... n){
		for(int i=0;i<n.length;i++){
			System.out.println("n["+i+"]:"+n[i]);
		}
		System.out.println("---------");
	}
	
	public static void main(String[] args){
		MethodTest03 m = new MethodTest03();
		m.argTest();
		m.argTest(5);
		m.argTest(5,6);
		m.argTest(5,6,7);
	}
}
