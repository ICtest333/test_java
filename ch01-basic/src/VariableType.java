public class VariableType {
	public static void main(String[] args){
		System.out.println("===����===");
		boolean b = true; //true,false
		System.out.println("b = " + b);
		
		System.out.println("===������===");
		//������ ũ�� : 2byte, ǥ������ : 0~65,535
		//�ٱ���ó���� ���� �����ڵ�(unicode) ���
		char c1 = 'A';
		char c2 = 65; //A�� �ƽ�Ű�ڵ尪 65
		char c3 = '\u0041';
		char c4 = '��';
		char c5 = '\uc790';
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		System.out.println("c5 = " + c5);
		
		System.out.println("===������===");
		//byte ũ�� : 1byte, ǥ������ : -128 ~ 127
		byte b1 = 127;
		
		//short ũ�� : 2byte, ǥ������ : -32,768 ~ 32,767
		short s1 = 32767;
		
		//int (���� ǥ���� �⺻) ũ�� : 4byte
		int it = 12345;
		
		//long ũ�� : 8byte
		long lg = 12345L;
		System.out.println("lg = " + lg);
		
		System.out.println("===�Ǽ���===");
		
		//float ũ�� : 4byte
		float f = 3.4f;
		System.out.println("f = " + f);
		
		//double (�Ǽ� ǥ���� �⺻) ũ�� : 8byte
		double du = 3.23;
		System.out.println("du = " + du);
	}
}






