package com.basic;

public class ExceptionEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] var = {10,20,30};
		
		for(int i=0;i<=3;i++){
			try{
				//���ܰ� �߻��� ���ɼ��� �ִ� �ڵ�
				System.out.println("var["+i+"]:"+var[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("���� �ε��� ȣ��");
			}
		}
		System.out.println("���α׷� ��!");
		

	}

}
