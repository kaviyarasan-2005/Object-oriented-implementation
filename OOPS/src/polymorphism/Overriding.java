package polymorphism;

public class Overriding {
public static void main(String[] args ) {
		K ref = new K();
		ref.k();
	}
}
class V{
	
	void name() {
		
		System.out.println("Class V");
	}
}
class K extends V{
	@Override
	void name() {
		System.out.println("Class K");
	}
	void k() {
		name();
	}
}