public class ArrayEx05 {
	public static void main(String[] args){
		int test[][]; //2차원 배열 선언
		test = new int[2][3]; //2차원 배열 생성
		
		//2차원 배열 초기화
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		
		System.out.println(test[0][0]);
		
		for(int i=0;i<test.length;i++){
			for(int j=0;j<test[i].length;j++){
				System.out.println(
				"test["+i+"]["+j+"]:"+test[i][j]);
			}
		}
		//2차원 배열 선언 및 생성
		int[][] test1 = new int[2][3];
		
		//2차원 배열 선언 및 생성, 초기화(명시적 배열 생성)
		int[][] test2 = new int[][]{
				                     {100,200,300},
				                     {400,500,600}
				                   };
		//2차원 배열 선언 및 생성, 초기화(암시적 배열 생성)
		int[][] test3 = {
				          {100,200,300},
				          {400,500,600}
		                };
	}
}



