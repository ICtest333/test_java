package com.map;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("�ظ�", new Integer(95));
		map.put("�츣�̿´�", new Integer(100));
		map.put("��", new Integer(85));
		map.put("�巹����", new Integer(93));
		map.put("�׺�", new Integer(70));
		//Ű�� �ߺ��� ������� ����
		map.put("�츣�̿´�", new Integer(0));
		//Ű�� null ����
		map.put(null, new Integer(100));
		//value�� null ����
		map.put("��ȣ��", null);
				
		System.out.println(map);
		
		Integer num = map.get("�츣�̿´�");
		System.out.println("�츣�̿´��� ������? " + num);
	}

}
