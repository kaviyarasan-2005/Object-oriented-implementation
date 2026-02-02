package interfa;
interface Engine{
	void start();
}
interface Egine2{
	void stop();
}
class Petrol implements Engine{
	public void start() {
		System.out.println("Petrol engine start");
	}
}
class Electric implements Engine{
	public void start() {
		System.out.println("Electric engine start");
	}
}

public class Coupling{
	
	public static void main(String[] args) {
		Engine eng;
		//tight coupled
		Petrol pe = new Petrol();
		pe.start();
		Electric ee = new Electric();
		ee.start();
		//loosely coupled
		eng = new Petrol();
		eng.start();
		eng = new Electric();
		eng.start();
	}
}
