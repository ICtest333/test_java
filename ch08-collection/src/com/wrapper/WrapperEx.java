package com.wrapper;

public class WrapperEx {

	public static void main(String[] args) {
		//�⺻�ڷ���
		int a = 100;
		
		//�����ڷ���    �⺻�ڷ���->�����ڷ���(boxing)
		Integer i = new Integer(a);
		
		System.out.println(i.intValue());//�����ڷ���->�⺻�ڷ���(unboxing)
		
		Integer obj1 = new Integer(30);
		Integer obj2 = new Integer(20);
		
		int sum = obj1.intValue() + obj2.intValue();
		
		System.out.println("sum = "+sum);
		
		System.out.println("================");
		//JDK5.0 �̻���� auto boxing/unboxing
		int sum2 = obj1 + obj2;//�����ڷ���->�⺻�ڷ���(auto unboxing)
		System.out.println("sum2 = "+sum2);
		
		//�⺻�ڷ���->�����ڷ���(auto boxing)
		Integer obj3 = 100;
		Integer obj4 = 200;
	}

}
