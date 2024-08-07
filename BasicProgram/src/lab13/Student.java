package lab13;

public class Student {
	
//	instance variables
	 public String name;
	 public int age;
	 public String department;
	
	Student() { // default constructor 
		
		this.name = "Unknown";
		this.age = 20;
		this.department = " Unassigned";
	}

	public Student(String name, int age) { // constructor that take two parameters
		super();
		this.name = name;
		this.age = age;
		this.department = "IT";
	}

	public Student(String name, int age, String department) {  // constructor that take three parameter
		super();
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	

}
