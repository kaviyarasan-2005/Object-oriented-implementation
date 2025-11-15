package JavaCheck;
class A implements Runnable{
	public void run() {
		System.out.println("Created by Runnable");
	}
}
public class RunnableThread {
	public static void main(String[] args) {
		Runnable obj = new A();
		Thread a = new Thread(obj);
		a.start();
	}
}
