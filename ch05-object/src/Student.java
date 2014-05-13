public class Student {
	//멤버 변수
	String name;
	int age;
	
	//생성자 : 생성자를 명시하지 않으면 컴파일러가 
	//        기본 생성자 자동 삽입
	//public Student(){}
	
	public static void main(String[] args){
		//객체 선언 및 생성
		Student student = new Student();
		
		System.out.println(student);
		System.out.println(student.name+","+student.age);
		
		student.name = "김연아";
		student.age = 24;
		System.out.println(student.name+","+student.age);

		Student student2 = new Student();
		System.out.println(student2);
		student2.name = "이상화";
		student2.age = 25;
		
		System.out.println(student2.name+","+student2.age);
		
	}
}
