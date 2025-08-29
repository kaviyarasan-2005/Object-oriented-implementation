

public class Object {
	public static void main(String[] args) {
		Facebook fb = new Facebook();
		System.out.println(fb.a +" constructor");
		fb.friendreq();
		Facebook.hello();
		Parametercons para = new Parametercons(14);
//		Facebook.hello().b; not work because b is a local variable if you need b return it in hello function
		
	}
}

class Facebook{
	int a;
	int b;
	// zero argument constructor
	Facebook(){
		a=10;
	}
	void friendreq() {
		System.out.println(b+" default Constructor");
		System.out.println("Mark mama");
		int c=0;
		System.out.println("Markk " + c);
	}
	static void hello() {
		System.out.println("This is static");
		int b = 20;
	}
}
class Parametercons{
	Parametercons(int k){
		System.out.println(k +"  Parameter constructor");
	}
}