package com.list;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Double> v = new Vector<Double>();
		//자원추가
		v.add(100.3);
		v.add(3.14);
		v.add(1000.);
		
		//출력(확장for문)
		for(Double n : v){
			System.out.println(n);
		}
		
		//자원검색
		double search = 1000.0; //검색요소
		
		int index = v.indexOf(search);//검색
		
		if(index != -1){
			System.out.println("검색요소 "+search+"의 위치 : "+index);
		}else{
			System.out.println("검색요소 "+search+"이 없습니다.");
		}
		
		//자원삭제
		double del = 3.14;//삭제할 요소
		if(v.contains(del)){//삭제할 요소가 vector에 포함되어져 있는지
			v.remove(del);
			System.out.println(del+" 삭제 완료");
		}
	}

}
