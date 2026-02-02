package interfa;

interface Flyable{
	int a = 120;
	void sound();
}
class Birds implements Flyable{
	public void sound() {
		System.out.println("Can make sound");
	}
}
class Kuruvi extends Birds{
	public void sound() {
		System.out.println("Movie");
	}
}
public class ISaRelation {
	public static void main(String[] args) {
		Flyable f = new Kuruvi();
		f.sound();
		System.out.println(Flyable.a);
	}
}
