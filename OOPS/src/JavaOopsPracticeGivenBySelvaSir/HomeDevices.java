package JavaOopsPracticeGivenBySelvaSir;

interface Device{
	// all device can do something
	void ThingToDo();
}
class TV implements Device{
//@Override
	public void ThingToDo() {
		System.out.println("Watch Movie ");
	}
	
}
class Printer implements Device{
	public void ThingToDo() {
		System.out.println("Print a Paper");
	}
}

class MicroWaven implements Device{
	public void ThingToDo() {
		System.out.println("Cook food");
	}
}
public class HomeDevices {
	public static void main(String[] args) {
		Device test = new TV();
		test.ThingToDo();
		test = new Printer();
		test.ThingToDo();
		test = new MicroWaven();
		test.ThingToDo();
	}
}
