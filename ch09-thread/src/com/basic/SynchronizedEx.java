package com.basic;

class ATM implements Runnable{
	private long depositeMoney = 10000;//공유자원
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<5;i++){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				if(depositeMoney<=0) break;
					
				withDraw(1000);
			}
		}
		
	}
	
	//임계영역
	public void withDraw(long howMuch){
		if(depositeMoney>0){
			depositeMoney -= howMuch;
			System.out.println(Thread.currentThread().getName()+", "+depositeMoney);
		}else{
			System.out.println(Thread.currentThread().getName()+", 잔액이 부족합니다.");
		}
	}
}

public class SynchronizedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		Thread mother = new Thread(atm,"mother");
		Thread son = new Thread(atm,"son");
		
		mother.start();//ATM의 run()호출
		son.start();//ATM의 run()호출
	}

}
