package JavaCheck;
import java.util.*;
import java.io.IOException;

public class MulticatchInTry {
	public static void main(String[] args) {
		int a =10;
		int d ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter division number ");
		try {
			d = scan.nextInt();
			a=a/d;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println("Error occurs"+ e);
		}
		
		try {
			System.out.println("2nd try catch");
		}
		catch(Exception e) {
			System.out.println("This will never work");
		}
	}
}