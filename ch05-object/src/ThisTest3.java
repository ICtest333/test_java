public class ThisTest3 {
	
	public ThisTest3(){
		//this() ���� ���๮�� ����ϸ� ���� �߻�
		/*System.out.println(
		"���ڰ� ���� �����ڸ� �̿��� ��ü ����!!");*/
		this("�ٶ�");
		System.out.println(
	          "���ڰ� ���� �����ڸ� �̿��� ��ü ����!!");
	}
	public ThisTest3(int n){
		          //int -> String
		this(String.valueOf(n));
		
	}
	public ThisTest3(String msg){
		System.out.println(msg);
	}
	
	public static void main(String[] args){
		ThisTest3 tt = new ThisTest3();
		System.out.println("==========");
		ThisTest3 tt2 = new ThisTest3(1000);
		
	}
}




