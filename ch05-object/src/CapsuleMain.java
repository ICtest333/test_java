class Capsule{
	private int a;//����ȭ
	
	//ĸ��ȭ
	public void setA(int n){
		
		if(n>=0){
			a = n;
		}else{
			System.out.println("������ ������ �ʽ��ϴ�!!");
		}
	}
	public int getA(){
		return a;
	}
}

public class CapsuleMain {
	public static void main(String[] args){
		Capsule cp = new Capsule();
		//���� �����ڰ� private�̱� ������ ȣ�� �Ұ�
		//cp.a = -10;
		
		cp.setA(-10);
		System.out.println(cp.getA());
	}
}
