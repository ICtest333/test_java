public class ArrayEx01 {
	public static void main(String[] args){
		char[] ch; //�迭 ����
		ch = new char[4]; //�迭 ����
		
		//�迭 �ʱ�ȭ
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		System.out.println(ch[0]);
		
		//�ݺ����� �̿��� �迭�� ���� ���
		for(int i=0;i<ch.length;i++){
			System.out.println("ch["+i+"]:"+ch[i]);
		}
		
		//�迭 ����, ����
		int it[] = new int[6];
		
		//�迭 ����, ����, �ʱ�ȭ(����� �迭 ����)
		char[] ch2 = new char[]{'J','a','v','a'};
		
		//�迭 ����, ����, �ʱ�ȭ(�Ͻ��� �迭 ����)
		char[] ch3 = {'��','��'};
		
	}
}




