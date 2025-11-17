package interfa;
interface Value{
	int val = 10;
}

class Handle implements Value {
	static int count;
	
	Handle(){
		count++;
		System.out.println(count+" "+ val);
	}
	void print() {
		Value v = new Handle();
		System.out.println(count+" "+ v.val);
	}
}

class nonInter {
	int k;
	public nonInter() {
		k = 10;
	}
	void prints() {
		System.out.println("Not implement Value");
	}
}
public class InterfacesDBT {
	public static void main(String[] args) {
		Handle h = new Handle();
		Value v = new Handle();
		System.out.println(v.val+" from main function");
		// only allow if the class implements 
//		v = new  nonInter();
		h.print();
//		for(int i=0;i<20;i++) {
//			h = new Handle();
//		}
	}
}
