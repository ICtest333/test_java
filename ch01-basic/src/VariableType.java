public class VariableType {
	public static void main(String[] args){
		System.out.println("===논리형===");
		boolean b = true; //true,false
		System.out.println("b = " + b);
		
		System.out.println("===문자형===");
		//문자형 크기 : 2byte, 표현범위 : 0~65,535
		//다국어처리를 위한 유니코드(unicode) 방식
		char c1 = 'A';
		char c2 = 65; //A의 아스키코드값 65
		char c3 = '\u0041';
		char c4 = '자';
		char c5 = '\uc790';
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		System.out.println("c4 = " + c4);
		System.out.println("c5 = " + c5);
		
		System.out.println("===정수형===");
		//byte 크기 : 1byte, 표현범위 : -128 ~ 127
		byte b1 = 127;
		
		//short 크기 : 2byte, 표현범위 : -32,768 ~ 32,767
		short s1 = 32767;
		
		//int (정수 표현의 기본) 크기 : 4byte
		int it = 12345;
		
		//long 크기 : 8byte
		long lg = 12345L;
		System.out.println("lg = " + lg);
		
		System.out.println("===실수형===");
		
		//float 크기 : 4byte
		float f = 3.4f;
		System.out.println("f = " + f);
		
		//double (실수 표현의 기본) 크기 : 8byte
		double du = 3.23;
		System.out.println("du = " + du);
	}
}






