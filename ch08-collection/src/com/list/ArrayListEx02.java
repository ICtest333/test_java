package com.list;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("������");//String -> Object
		al.add("������");
		al.add("�迬��");
		al.add("�̻�ȭ");
		
		
		for(int i=0;i<al.size();i++){
			String name = (String)al.get(i);
			
			System.out.println(name);
		}
	}

}
