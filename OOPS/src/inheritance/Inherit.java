package inheritance;

public class Inherit {
	public static void main(String[] args) {
		C ref = new C();
		ref.run();// child class
		ref.test();//parent class
		ref.pt();//grant child class
	}
}
class A{
	int k=10;
	int test() {
		System.out.println("Class A");
		return 90;
	}
}
class B extends A{
	int m=20;
	B(){
		System.out.println("Class B is initiated");
	}
	B(String s){
		System.out.println("Super "+s);
	}
	void run() {
		System.out.println("Class B  " + k);
		int val = test();
		System.out.println("get a  return value from Class A "+ val);
	}
}
class C extends B{
	C(){
//		super("kavi");
		this("kavi");
		System.out.println("Class C is initiated");
		
	}
	C(String s){
		System.out.println("this function "+s);
	}
	void pt() {
		System.out.println("This C class extend B and B extends A "+k);
	}
}