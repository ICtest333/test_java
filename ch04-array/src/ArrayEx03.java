public class ArrayEx03 {
	public static void main(String[] args){
		int sum = 0; //����
		float avg = 0.0f; //���
		
		int[] score = {100,88,88,100,90};
		
		for(int i=0;i<score.length;i++){
			sum += score[i];
		}
	//  float  int->float       float	
		avg = sum / (float)score.length;
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
	}
}
