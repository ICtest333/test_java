package com.list;

import java.util.ArrayList;

public class ArrayListEx03 {

	public static void main(String[] args) {
		//JDK5.0 �̻���� ��밡��
		//���׸� ǥ���� ��ü ������ ����� �������� Ÿ���� �����ϴ� ���
		ArrayList<String> al = new ArrayList<String>();
		al.add("�迬��");//String -> Object
		al.add("�̻�ȭ");
		//���׸� ǥ���� ����ؼ� String �����͸� �����ϰڴٰ� ��� �߱� ������ Integer �����ʹ� ���� �Ұ���
		//al.add(new Integer(100));//Integer -> Object
		al.add("�ڸ��");
		
		for(int i=0;i<al.size();i++){
			String name = al.get(i);
			
			System.out.println(name);
		}
		System.out.println("===========");
		//Ȯ�� for�� (JDK5.0 �̻����)
		for(String name : al){
			System.out.println(name);
		}
	}

}
