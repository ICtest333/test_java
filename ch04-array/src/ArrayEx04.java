public class ArrayEx04 {
	public static void main(String[] args){
		int[] score = {79,88,91,33,100,55,95};
		
		//기준값 설정
		int max = score[0];
		int min = score[0];
		
		for(int i=1;i<score.length;i++){
			//최대값
			if(score[i]>max){
				max = score[i];
			}
			//최소값
			if(score[i]<min){
				min = score[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
