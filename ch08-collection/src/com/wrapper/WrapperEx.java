package com.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		//기본자료형
		int a = 100;
		
		//참조자료형    기본자료형->참조자료형(boxing)
		Integer i = new Integer(a);
		
		System.out.println(i.intValue());//참조자료형->기본자료형(unboxing)
		
		Integer obj1 = new Integer(30);
		Integer obj2 = new Integer(20);
		
		int sum = obj1.intValue() + obj2.intValue();
		
		System.out.println("sum = "+sum);
		
		System.out.println("================");
		//JDK5.0 이상부터 auto boxing/unboxing
		int sum2 = obj1 + obj2;//참조자료형->기본자료형(auto unboxing)
		System.out.println("sum2 = "+sum2);
		
		//기본자료형->참조자료형(auto boxing)
		Integer obj3 = 100;
		Integer obj4 = 200;
	}

}
