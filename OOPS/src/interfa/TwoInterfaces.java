package interfa;

interface And{
	void name();
}
interface B extends And{
	void name2();
}
public class TwoInterfaces {
	public static void main(String[] args) {
		B a = new faces();
		a.name2();
	}
}
class faces implements B{
	@Override
	public void name2() {
		System.out.println("name from B");
	}
	@Override
	public void name(){
		System.out.println("Name from A");
	}
}
