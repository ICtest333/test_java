package com.list;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("박지성");//String -> Object
		al.add("송종국");
		al.add("김연아");
		al.add("이상화");
		
		
		for(int i=0;i<al.size();i++){
			String name = (String)al.get(i);
			
			System.out.println(name);
		}
	}

}
