package inheritance;

class Animal{
	int age = 200;
	Animal(){
		System.out.println("Animal");
	}
	
}

class Dog extends Animal{
	int age = 20;
	Dog(){
		System.out.println("Dog without Dog");
	}
	Dog(String str){
		super();
		System.out.println("Dog");
		
	}
}

class puppy extends Dog{
	puppy(){
		super();
		System.out.println("Can circus");
		System.out.println(super.age);
	}
}

public class Inheritance2 {
		public static void main(String[] args) {
			puppy p = new puppy();
			
		}
}
