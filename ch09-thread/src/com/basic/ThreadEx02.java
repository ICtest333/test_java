package com.basic;



public class ThreadEx02 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(1000);//������ �ð���ŭ ������ ����
				            //1/1000(�и�������)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("������ �̸� : "+Thread.currentThread().getName());
			System.out.println(", temp value : "+i);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx02 th = new ThreadEx02();
		Thread t = new Thread(th,"�ι�°");
		t.start();//ThreadEx02�� run() ȣ��
		
		
	}

}