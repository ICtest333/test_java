package com.basic;

public class ThreadEx03 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(1000);//지정된 시간만큼 수행을 멈춤
				            //1/1000(밀리세컨드)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("스레드 이름 : "+Thread.currentThread().getName());
			
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx03 th = new ThreadEx03();
		Thread t = new Thread(th,"첫번째****");
		t.start();
		Thread t2 = new Thread(th,"두번째====");
		t2.start();
		Thread t3 = new Thread(th,"세번째++++");
		t3.start();
		Thread t4 = new Thread(th,"네번째@@@@");
		t4.start();
	
	}

}
