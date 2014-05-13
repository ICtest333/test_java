package com.inner3;


public class StaticEx01 {
	
	//static 내부클래스
	public static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx01.StaticInner i = new StaticEx01.StaticInner();
		
		System.out.println(i.iv);
		System.out.println(StaticEx01.StaticInner.cv);
	}

}
