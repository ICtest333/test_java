package com.basic;

public class ExceptionEx04 {
	
	public void methodA(String[] n) throws Exception{
		if(n.length>0){
			for(int i=0;i<n.length;i++){
				System.out.println(n[i]);
			}
		}else{
			//������ ���� �߻��ϱ�
			throw new Exception("�Է��� �����Ͱ� �����ϴ�.");
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionEx04 ex = new ExceptionEx04();
		try {
			ex.methodA(args);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
