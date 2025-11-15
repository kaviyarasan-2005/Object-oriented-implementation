package interfa;

public class Inter {
	public static void main(String[] args) {
		A ref = new A();
		ref.test();
		ref.test2();
		ref.name();
		Demo.name1(1);
		
	}
}
interface Demo{
	static void name1(int a) {
		System.out.println("Inside a name");
	}
	int val = 10;
	 void name(); // this is abstract class no need of abstract keyword 
	 //but use of keyword also not a mistake
}
interface Demo2{
	abstract void test2();
}

class A implements Demo,Demo2{
	public void name() {
		Demo.name1(10);
		System.out.println("sdcfsd");
	}
	public void test(){
		System.out.println("Implement interface");
	}
	public void test2() {
		System.out.println("Multiple inheritance in Interface");
	}
}