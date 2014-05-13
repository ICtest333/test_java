package com.basic;

//사용자 정의 예외 클래스
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
				//사용자가 정의한 예외를 인위적으로 발생시킴
				throw new UserException("양수가 아닙니다.");
			}
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
	}

}
