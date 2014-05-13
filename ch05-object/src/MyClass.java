public class MyClass {
	String name;
	int age;
	
	//생성자를 명시하지 않으면 컴파일러가 자동적으로
	//기본 생성자 삽입
	
	public MyClass(){}
	
	public MyClass(String n, int a){
		name = n;
		age = a;
	}
}
