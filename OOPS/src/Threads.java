class First extends Thread{
	int j =0;
	public void run(){
		for(int i=0;i<50;i++) {
//			try {
//			Thread.sleep(10);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
			j = i;
		}
	}
}

class Sec extends Thread{
	int j=0;
	public void run() {
		for(int i=0;i< 50;i++) {
//			System.out.println("hello");
//			try {
//				Thread.sleep(10);
//			}
//			catch(Exception e) {
//				System.out.println(e);
//			}
			j=i;
			
		}
	}
}




public class Threads {
	public static void main(String[] args) throws Exception {
		First f = new First();
		Sec s = new Sec();
		f.setPriority(10);
		s.setPriority(1);
		f.start();
		s.start();
		System.out.println("this process not wait for a Thread compleation "+ f.j);
		s.join();
		System.out.println("This will wait beacause of join "+ s.j);
		int a= 10/0;
	}
}
