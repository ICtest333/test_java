package com.list;

import java.util.ArrayList;

public class ArrayListEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("��ȣ��");//0
		al.add("����ȣ");//1
		al.add("�߽ż�");//2
		al.add("������");//3
		
		System.out.println(al);
		
		//����� ����
		al.remove(2);
		
		for(int i=0;i<al.size();i++){
			System.out.println(i+", "+al.get(i));
		}
	}

}
