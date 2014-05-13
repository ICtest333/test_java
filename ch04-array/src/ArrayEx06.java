public class ArrayEx06 {
	public static void main(String[] args){
		int[][] score = {
			 	         {99,99,99},
			 	         {20,20,20},
			 	         {30,30,30},
			 	         {40,40,40},
			 	         {50,50,50}
		                };
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("==========================");
		for(int i=0;i<score.length;i++){
			int sum = 0;
			System.out.print(" " + (i+1) + " ");
			for(int j=0;j<score[i].length;j++){
				sum+=score[i][j];
				System.out.print(score[i][j]+" ");
			}
			System.out.println(sum+" "+sum/score[i].length);
		}
	}
}
