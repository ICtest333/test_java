package com.list;

import java.util.ArrayList;

public class ArrayListEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("강호동");//0
		al.add("박찬호");//1
		al.add("추신수");//2
		al.add("박지성");//3
		
		System.out.println(al);
		
		//요소의 삭제
		al.remove(2);
		
		for(int i=0;i<al.size();i++){
			System.out.println(i+", "+al.get(i));
		}
	}

}
