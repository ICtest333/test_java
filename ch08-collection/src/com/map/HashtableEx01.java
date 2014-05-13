package com.map;

import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Double> ht = new Hashtable<String,Double>();
		ht.put("õ����", new Double(167.3));
		ht.put("������", new Double(181.2));
		ht.put("�����", new Double(185.5));
		ht.put("������", new Double(161.7));
		ht.put("���ְ�", new Double(178.9));
		//Ű�� �ߺ��� ������� ����
		ht.put("õ����", new Double(169.3));
		//Ű�� null�� ��� �ȵ�(����� ���� �߻�)
		//ht.put(null, new Double(120.8));
		//value�� null�� ��� �ȵ�(����� ���� �߻�)
		//ht.put("������",null);
		
		System.out.println(ht);
		
		Double keyNum = ht.get("õ����");
		System.out.println("õ������ Ű�� "+keyNum);
		
		System.out.println("================");
		
		Enumeration<String> en = ht.keys();
		while(en.hasMoreElements()){
			String key = en.nextElement();
			System.out.println(key+","+ht.get(key));
		}
		
	}

}