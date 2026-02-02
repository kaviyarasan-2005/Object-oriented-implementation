package interfa;

public class Inter implements Demo{
	public static void main(String[] args) {
		A ref = new A();
		ref.test();
		ref.test2();
		ref.name();
		Demo.name1(1);
		Demo m = new A();
	}
	public void name() {
		System.out.println("kaviarasan");
	}
}
interface Demo{
	// static method allow to implemented a method inside interface 
	// can access by 
	static void name1(int a) {
		System.out.println("Inside a name");
	}
	default void name3() {
		System.out.println("Console.log");
	}
	int val = 10;
	 void name(); // this is abstract class no need of abstract keyword 
	 			  // but use of keyword also not a mistake
}
interface Demo2{
	abstract void test2();
}
class A implements Demo,Demo2{
	public void name() {
		Demo.name1(10);
     	Demo d = new A();
     	d.name3();
		System.out.println("sdcfsd");
	}
	public void test(){
		System.out.println("Implement interface");
	}
	public void test2() {
		System.out.println("Multiple inheritance in Interface");
	}
}