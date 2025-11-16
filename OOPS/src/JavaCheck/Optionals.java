package JavaCheck;
import java.util.*;
// optional used for identify 
public class Optionals {
	public static void main(String[] args) {
		Optional<Employee> e = getEmployee();
		System.out.println(e.map(Employee::getName).orElse("No Name Found"));
	}
	static Optional<Employee> getEmployee(){
		Employee e = new Employee(1,"Kavi");
		 return Optional.ofNullable(e);
	}
}

class Employee{
	int id;
	String name;
	Employee(int id, String name){
			this.id = id;
			this.name = name;
	}
	int getId(){
		return this.id;
	}
	String getName() {
		return this.name;
	}
	void setId(int id){
		this.id = id;
	}
	void setName(String Name) {
		this.name = name;
	}
}
