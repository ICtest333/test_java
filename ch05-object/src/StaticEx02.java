public class StaticEx02 {
	String s1 = "static";//�ν��Ͻ� ����
	static String s2 = "STATIC";//static ����
	
	public static String getString(){
		return s2;
	}
	
	public static void main(String[] args){
		//�ν��Ͻ� ������ ��ü ���� �� ȣ���ؾ� ��
		//System.out.println(s1);
		
		//static ������ ȣ���ϸ� �޸𸮿� �ö󰡱� ������
		//��ü ���� ���� ȣ�� ����
		System.out.println(s2);
		
		System.out.println(getString());
		
	}
}



