package objectasdatatype;
import java.util.*;

class Verify {
	
	String name = "kavi";
	int age =10;
//	@Override
	public String toString() {
		return "Name "+ name +", Age "+age;
	}
}

public class ObjectDataType {
	public static void main(String[] args) {
		Verify ver = new Verify();
		Queue<Verify> name = new LinkedList<>();
		name.add(ver);
		System.out.println(name.poll());
	}
}
