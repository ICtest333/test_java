package com.list;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Double> v = new Vector<Double>();
		//�ڿ��߰�
		v.add(100.3);
		v.add(3.14);
		v.add(1000.);
		
		//���(Ȯ��for��)
		for(Double n : v){
			System.out.println(n);
		}
		
		//�ڿ��˻�
		double search = 1000.0; //�˻����
		
		int index = v.indexOf(search);//�˻�
		
		if(index != -1){
			System.out.println("�˻���� "+search+"�� ��ġ : "+index);
		}else{
			System.out.println("�˻���� "+search+"�� �����ϴ�.");
		}
		
		//�ڿ�����
		double del = 3.14;//������ ���
		if(v.contains(del)){//������ ��Ұ� vector�� ���ԵǾ��� �ִ���
			v.remove(del);
			System.out.println(del+" ���� �Ϸ�");
		}
	}

}