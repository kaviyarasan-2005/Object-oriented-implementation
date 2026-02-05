package inheritance;

class Cons{
	int a;
	Cons(){
		System.out.println("decline");
	}
	Cons(int a){
		this.a=a;
		System.out.println("call"+a);
	}
	void print() {
		System.out.println("Print from cons");
	}
}
class AA extends Cons{
	AA(){
		System.out.println("A object created");
	}
	AA(int a){
		System.out.println("aa s constructor"+a);
	}
	void print() {
		System.out.println("Print from A");
	}
}
class BB extends AA{
	BB(){
		System.out.println("B object created");
	}
	void print() {
		System.out.println("Print from B");
	}
}

public class Constructors extends B{
	public static void main(String[] args) {
	BB b = new BB();
	b.print();
		
	}
}

