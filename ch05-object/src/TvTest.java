class Tv{
	//�������(�Ӽ�)
	String color;//����
	boolean power;//��������
	int channel;//ä��
	
	//����޼���(����)
	public void power(){
		power = !power;
	}
	public void channelUp(){
		++channel;
		return;//�Ϲ������� ����
	}
	public void channelDown(){
		--channel;
	}
}
public class TvTest {
	public static void main(String[] args){
		Tv t = new Tv();
		t.power(); //false -> true
		System.out.println("Tv ���� ���� : " + t.power);
		
		t.channel = 7; //ä�� �Ҵ�
		System.out.println("���� ä�� : " + t.channel);
		
		t.channelDown(); //ä�� ����
		System.out.println("����� ä�� : " + t.channel);
		
		t.power(); //true -> false
		System.out.println("Tv ���� ���� : " + t.power);
	}
}




