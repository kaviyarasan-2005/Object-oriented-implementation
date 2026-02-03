package Custom_Objects;

public class Main {
	public static void main(String[] args){
		Student s = new Student(1); 
		Student[] st = new Student[2];
		st[0] = s;
		System.out.println(st[0].id);
	}
}
class Student{
	int id;
	Student(int id){
		this.id = id;
	}
}
