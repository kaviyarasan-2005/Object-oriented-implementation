package Abstraction;

public class Abstract {
	public static void main(String[] args) {
		 Ab ref = new Ex();
		 ref.name();
		 
		 
	}
}
 abstract class Ab{
	 abstract void name();
}
 class Ex extends Ab {
	 void name() {
		 System.out.println("System rajinikanth");
	 }
}