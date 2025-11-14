package JavaCheck;
class Name{
	static {
		System.out.println("Members");
	}
	 static int na = 10;
	int b = 20;
	Name(){
		System.out.println("Name printed");
	}
}
class Kaviyarasan{
	static {
		System.out.println("Run prograsm");
	}
}
public class Static_check {
	public static void main(String[] args) {
		System.out.println(Name.na);
		Kaviyarasan k = new Kaviyarasan();
		Name s = new Name();
		System.out.println(s.b);
	}
}	
