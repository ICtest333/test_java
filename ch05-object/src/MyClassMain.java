public class MyClassMain {
	public static void main(String[] args){
		MyClass m = new MyClass();
		m.name = "��ȣ��";
		m.age = 45;
		System.out.println(m.name+","+m.age);
		
		MyClass m2 = new MyClass("���缮",43);
		System.out.println(m2.name+","+m2.age);
	}
}
