public class MethodTest01 {
	
	//�������� ���
	//�� ȣ��(Call by Value)
	
	//����޼���
	public int increase(int n){
		++n;
		return n;
	}
	
	public static void main(String[] args){
		int var1 = 100;
		
		MethodTest01 m = new MethodTest01();
		int var2 = m.increase(var1);
		
		System.out.println("var1 : " + var1 +","+
				           "var2 : " + var2);
	}
}
