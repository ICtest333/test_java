public class MethodTest02 {
	
	//���� ���� ���
	//���� ȣ��(Call by Reference)
	
	public void increase(int[] n){
		for(int i=0;i<n.length;i++){
			n[i]++;
		}
	}
	
	public static void main(String[] args){
		int[] ref = {100,200,300};
		for(int i=0;i<ref.length;i++){
			System.out.print(ref[i]+"\t");
		}
		System.out.println("\n=========");
		MethodTest02 m = new MethodTest02();
		m.increase(ref);//��ü�� �ּ� ����
		
		for(int i=0;i<ref.length;i++){
			System.out.print(ref[i]+"\t");
		}
	}
}




