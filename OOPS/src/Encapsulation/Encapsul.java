package Encapsulation;

public class Encapsul {
	public static void main(String[] args) {
		
		Demo ref = new Demo();
	
		ref.setage(24);
	System.out.println(ref.getage());
	}
}

class Demo{
		private int age =10;
		
		public int getage() {
			return age;
		}
		public void setage(int age) {
			this.age = age;
			System.out.println("Age changed "+ this.age);
		}
		
	
}