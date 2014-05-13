package com.basic;

public class ThreadEx01 extends Thread{

	public ThreadEx01(String threadName){
		super(threadName);
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			try {
				sleep(1000);//지정된 시간만큼 수행을 멈춤
				            //1/1000(밀리세컨드)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("스레드 이름 : "+currentThread().getName());
			System.out.println(", temp value : "+i);
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx01 th = new ThreadEx01("첫번째");
		th.start();//start()->run() 병렬수행
	}

}
