package polymorphism;

public class Overriding {
public static void main(String[] args ) {
		V ref = new V();
		ref.name();
	}
}
class V{
	void name() {
		
		System.out.println("Class V");
	}
}
class K extends V{
	void name() {
		
		System.out.println("Class K");
	}
}