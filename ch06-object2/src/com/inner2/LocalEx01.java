package com.inner2;

class LocalInner{
	public void innerTest() {
		class Inner{
			public void getData() {
				System.out.println("Local inner class");
			}
		}
		Inner i = new Inner();
		i.getData();
	}
}

public class LocalEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInner in = new LocalInner();
		in.innerTest();
		
	}

}
