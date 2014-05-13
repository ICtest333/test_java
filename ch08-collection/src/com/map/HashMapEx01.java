package com.map;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("해리", new Integer(95));
		map.put("헤르미온느", new Integer(100));
		map.put("론", new Integer(85));
		map.put("드레이코", new Integer(93));
		map.put("네빌", new Integer(70));
		//키의 중복을 허용하지 않음
		map.put("헤르미온느", new Integer(0));
		//키의 null 인정
		map.put(null, new Integer(100));
		//value에 null 인정
		map.put("강호동", null);
				
		System.out.println(map);
		
		Integer num = map.get("헤르미온느");
		System.out.println("헤르미온느의 성적은? " + num);
	}

}
