public class IfEx01 {
	public static void main(String[] args){
		java.util.Scanner input =
				new java.util.Scanner(System.in);
		
		int score;
		char grade;
		
		System.out.print("성적 입력>");
		score = input.nextInt();
		
		if(score >= 90 && score <= 100){
			grade = 'A';
		}else if(score >= 80 && score <= 89){
			grade = 'B';
		}else if(score >= 70 && score <= 79){
			grade = 'C';
		}else if(score >= 60 && score <= 69){
			grade = 'D';
		}else if(score >= 0 && score <= 59){
			grade = 'F';
		}else{
			grade = '?';
		}
		
		System.out.println("성적 : " + score);
		System.out.println("학점 : " + grade);
		
	}
}











