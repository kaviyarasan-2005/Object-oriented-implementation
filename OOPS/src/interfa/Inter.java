package interfa;

public class Inter {
	public static void main(String[] args) {
		A ref = new A();
		ref.test();
		ref.test2();
	}
}
interface Demo{
	 void test(); // this is abstract class no need of abstract keyword 
	 //but use of keyword also not a mistake
}
interface Demo2{
	abstract void test2();
}

class A implements Demo,Demo2{
	public void test(){
		System.out.println("Implement interface");
	}
	public void test2() {
		System.out.println("Multiple inheritance in Interface");
	}
}