package lab13;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("default constructor");
		Student s1 = new Student();
		
		System.out.println(s1.name );
		System.out.println(s1.age);
		System.out.println(s1.department);
		 
		Student s2 = new Student("Neha", 22);
		System.out.println("constructor woth 2 parameter");
	System.out.println(s2);
	System.out.println(s2.department);
		
	System.out.println("constructor woth 3 parameter");
		Student s3 = new Student("Rahul", 26, "ITI");
		System.out.println(s3);
	}

}
