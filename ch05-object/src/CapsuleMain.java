class Capsule{
	private int a;//은닉화
	
	//캡슐화
	public void setA(int n){
		
		if(n>=0){
			a = n;
		}else{
			System.out.println("음수는 허용되지 않습니다!!");
		}
	}
	public int getA(){
		return a;
	}
}

public class CapsuleMain {
	public static void main(String[] args){
		Capsule cp = new Capsule();
		//접근 지정자가 private이기 때문에 호출 불가
		//cp.a = -10;
		
		cp.setA(-10);
		System.out.println(cp.getA());
	}
}
