package JavaCheck;

public class ParamerterePassing {
	public static void main(String[] args) {
		display(1);
		display(1,2);
		display(1,2,34,5);
	}
	
	private static void display(int t) {
		System.out.println(1);
	}
	private static void display(int t, int k) {
		System.out.println(11);
	}
	private static void display(int... t) {
		System.out.println(124);
	}

}
