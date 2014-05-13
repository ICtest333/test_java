package com.list;

import java.util.ArrayList;

class A{
	@Override //Object의 toString 재정의
	public String toString(){
		return "A";
	}
}

public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList<>();
		al.add(new A());//A -> Object
		al.add("여름");//String -> Object
		al.add(new Integer(100));//Integer -> Object
		
		System.out.println(al);
	}

}
