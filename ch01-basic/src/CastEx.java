public class CastEx {
	public static void main(String[] args){
		System.out.println("===���θ��===");
		//�� ū �ڷ������� �°�, �ڷ��� �ս��� ����
		//�ڵ������� ����ȯ��
		byte b1 = 127;
		byte b2 = 127;
		int b3 = b1 + b2;//32bit�̸� �ڷ��� �������� ������ ���
		                 //32bit int�� �ڵ������� ����ȯ
		
		short s1 = 32767;
		short s2 = 32767;
		int s3 = s1 + s2;//32bit�̸� �ڷ��� �������� ������ ���
                         //32bit int�� �ڵ������� ����ȯ
		
		int in1 = 1234;
		double du1 = 3.5;
		//    double   int    double
		double result = in1 + du1;//int -> double �ڵ������� ����ȯ
		
		System.out.println("result = " + result);
		
		int in2 = 1234;
		long lg = 1234L;
		//    long     int   long
		long result2 = in2 + lg; //int -> long �ڵ������� ����ȯ
		
		System.out.println("result2 = " + result2);
		
		System.out.println("===����===");
		//�� ���� �ڷ������� ����, ������ �ս��� ���� �� ����
		//����� ����ȯ
		byte b4 = 127;
		byte b5 = 127;
		byte b6 = (byte)(b4 + b5);//int -> byte ����� ����ȯ
		
		System.out.println("b6 = " + b6);
		
		short s4 = 12345;
		short s5 = 12345;
		short s6 = (short)(s4 + s5);//int -> short ����� ����ȯ
		
		System.out.println("s6 = " + s6);
		
		int it2 = 123;
		float f2 = 3.5f;
		//   int      int   float
		int result4 = it2 + (int)f2;//float->int ����� ����ȯ
		System.out.println("result4 = " + result4);
		
		
	}
}





