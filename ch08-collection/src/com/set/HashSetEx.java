package com.set;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"java", "jsp", "android", "java", "spring"};
		
		HashSet<String> hs = new HashSet<String>();
		for(String n : str){
			hs.add(n);//중복 값을 허용하지 않음
		}
		
		System.out.println(hs);
		
		//출력
		Iterator<String> ir = hs.iterator();
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
		System.out.println("====================");
		
		//확장for문 사용
		for(String s : hs){
			System.out.println(s);
		}
	}

}
