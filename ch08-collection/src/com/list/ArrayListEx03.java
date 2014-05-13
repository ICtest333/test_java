package com.list;

import java.util.ArrayList;

public class ArrayListEx03 {

	public static void main(String[] args) {
		//JDK5.0 이상부터 사용가능
		//제네릭 표현은 객체 생성시 저장될 데이터의 타입을 지정하는 방식
		ArrayList<String> al = new ArrayList<String>();
		al.add("김연아");//String -> Object
		al.add("이상화");
		//제네릭 표현을 사용해서 String 데이터만 저장하겠다고 명시 했기 때문에 Integer 데이터는 저장 불가능
		//al.add(new Integer(100));//Integer -> Object
		al.add("박명수");
		
		for(int i=0;i<al.size();i++){
			String name = al.get(i);
			
			System.out.println(name);
		}
		System.out.println("===========");
		//확장 for문 (JDK5.0 이상부터)
		for(String name : al){
			System.out.println(name);
		}
	}

}
