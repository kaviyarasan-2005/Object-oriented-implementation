package polymorphism;

public class Polymorphism {
	public static void main(String[] args) {
		
		A ref= new A();
		ref.test('a');
		ref.test(3);
		ref.test(2.333);
	}
}
class A{
	void test(int a) {
		System.out.println("Method 1");
	}
	
	void test(double a) {
		System.out.println("Method 2");
	}
	void test(char a) {
		System.out.println("Method 3");
	}
}