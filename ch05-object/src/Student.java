public class Student {
	//��� ����
	String name;
	int age;
	
	//������ : �����ڸ� ������� ������ �����Ϸ��� 
	//        �⺻ ������ �ڵ� ����
	//public Student(){}
	
	public static void main(String[] args){
		//��ü ���� �� ����
		Student student = new Student();
		
		System.out.println(student);
		System.out.println(student.name+","+student.age);
		
		student.name = "�迬��";
		student.age = 24;
		System.out.println(student.name+","+student.age);

		Student student2 = new Student();
		System.out.println(student2);
		student2.name = "�̻�ȭ";
		student2.age = 25;
		
		System.out.println(student2.name+","+student2.age);
		
	}
}
