package com.ext3;

class Parent{
	int a = 100;
}

class Child extends Parent{
	int b = 200;
}

public class Exten01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ch = new Child();
		
		System.out.println(ch.a);
		System.out.println(ch.b);
		
		Parent p = ch;//자식클래스타입 -> 부모클래스타입
		              //업캐스팅, 자동적으로 형변환
					  //형변환 - 호출 범위의 변환
		
		System.out.println(p.a);
//		System.out.println(p.b); 호출범위를 벗어나 호출 불가능
		
		Child ch2 = (Child)p;//부모클래스타입 -> 자식클래스타입
		                     //다운캐스팅, 명시적으로 형변환
		System.out.println(ch2.a);
		System.out.println(ch2.b);
		
	}

}
