package JavaCheck;
import java.util.*;
public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 10;
		try {
			System.out.println(a);
			System.out.println("Enter age  ");
			a = scan.nextInt();
			if(a < 0) {
				throw new Exception("Age Should be grater than 0");
			}
			if(a < 18) {
				throw new InputInvalidException("Age should grater than or equal to 18");
			}
		}
		catch (Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Resourse close");
		}
		System.out.println("Program end here");
	}
}

class InputInvalidException extends Exception{
	public InputInvalidException(String s) {
		super(s);
	}
}
