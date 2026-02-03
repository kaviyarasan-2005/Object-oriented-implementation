package inheritance;

public class Constructors {
	public static void main(String[] args) {
		int a = 10;
		Cons c;
		if(a !=0) {
			 c = new Cons();
		}
		else {
			 c = new Cons(a);
		}
		System.out.println(c.a);
	}

}
class Cons{
	int a;
	Cons(){
		this(12);
		System.out.println("decline");
	}
	Cons(int a){
		this.a=a;
		System.out.println("call");
	}
}
