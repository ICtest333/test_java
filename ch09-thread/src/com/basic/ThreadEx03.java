package com.basic;

public class ThreadEx03 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(1000);//������ �ð���ŭ ������ ����
				            //1/1000(�и�������)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("������ �̸� : "+Thread.currentThread().getName());
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx03 th = new ThreadEx03();
		Thread t = new Thread(th,"ù��°****");
		t.start();
		Thread t2 = new Thread(th,"�ι�°====");
		t2.start();
		Thread t3 = new Thread(th,"����°++++");
		t3.start();
		Thread t4 = new Thread(th,"�׹�°@@@@");
		t4.start();
	
	}

}