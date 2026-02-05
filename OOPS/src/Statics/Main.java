package Statics;

public class Main {
	public static void main(String[] args) {
		A obj = new B();
		obj.print();
//	compiler obj.print() -> A.print() because of reference type
		A.print();
		B.print();
		System.out.println("System.out");
	}
}
	// this print methods are stored in method area of respective classes
	// this is called method hiding not method overriding
class A{
	static {
		System.out.println("kabi");
	}
	static void print() {
		System.out.println("A");
	}
}
class B extends A{
	static void print() {
		System.out.println("B");
	}
}