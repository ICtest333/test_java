package com.map;

import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Double> ht = new Hashtable<String,Double>();
		ht.put("천송이", new Double(167.3));
		ht.put("도민준", new Double(181.2));
		ht.put("이재경", new Double(185.5));
		ht.put("유세미", new Double(161.7));
		ht.put("이휘경", new Double(178.9));
		//키의 중복을 허용하지 않음
		ht.put("천송이", new Double(169.3));
		//키에 null이 허용 안됨(실행시 오류 발생)
		//ht.put(null, new Double(120.8));
		//value에 null이 허용 안됨(실행시 오류 발생)
		//ht.put("우주인",null);
		
		System.out.println(ht);
		
		Double keyNum = ht.get("천송이");
		System.out.println("천송이의 키는 "+keyNum);
		
		System.out.println("================");
		
		Enumeration<String> en = ht.keys();
		while(en.hasMoreElements()){
			String key = en.nextElement();
			System.out.println(key+","+ht.get(key));
		}
		
	}

}
