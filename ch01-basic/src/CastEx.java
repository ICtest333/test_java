public class CastEx {
	public static void main(String[] args){
		System.out.println("===프로모션===");
		//더 큰 자료형으로 승격, 자료의 손실이 없음
		//자동적으로 형변환됨
		byte b1 = 127;
		byte b2 = 127;
		int b3 = b1 + b2;//32bit미만 자료형 데이터의 연산의 경우
		                 //32bit int로 자동적으로 형변환
		
		short s1 = 32767;
		short s2 = 32767;
		int s3 = s1 + s2;//32bit미만 자료형 데이터의 연산의 경우
                         //32bit int로 자동적으로 형변환
		
		int in1 = 1234;
		double du1 = 3.5;
		//    double   int    double
		double result = in1 + du1;//int -> double 자동적으로 형변환
		
		System.out.println("result = " + result);
		
		int in2 = 1234;
		long lg = 1234L;
		//    long     int   long
		long result2 = in2 + lg; //int -> long 자동적으로 형변환
		
		System.out.println("result2 = " + result2);
		
		System.out.println("===디모션===");
		//더 작은 자료형으로 강등, 정보의 손실이 있을 수 있음
		//명시적 형변환
		byte b4 = 127;
		byte b5 = 127;
		byte b6 = (byte)(b4 + b5);//int -> byte 명시적 형변환
		
		System.out.println("b6 = " + b6);
		
		short s4 = 12345;
		short s5 = 12345;
		short s6 = (short)(s4 + s5);//int -> short 명시적 형변환
		
		System.out.println("s6 = " + s6);
		
		int it2 = 123;
		float f2 = 3.5f;
		//   int      int   float
		int result4 = it2 + (int)f2;//float->int 명시적 형변환
		System.out.println("result4 = " + result4);
		
		
	}
}





