package com.basic;

//����� ���� ���� Ŭ����
class UserException extends Exception{
	public UserException(String str){
		super(str);
	}
}

public class UserExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = -11;
			if(a<=0){
				//����ڰ� ������ ���ܸ� ���������� �߻���Ŵ
				throw new UserException("����� �ƴմϴ�.");
			}
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
	}

}
