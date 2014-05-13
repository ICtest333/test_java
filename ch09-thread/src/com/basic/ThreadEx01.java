package com.basic;

public class ThreadEx01 extends Thread{

	public ThreadEx01(String threadName){
		super(threadName);
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			try {
				sleep(1000);//������ �ð���ŭ ������ ����
				            //1/1000(�и�������)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("������ �̸� : "+currentThread().getName());
			System.out.println(", temp value : "+i);
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx01 th = new ThreadEx01("ù��°");
		th.start();//start()->run() ���ļ���
	}

}