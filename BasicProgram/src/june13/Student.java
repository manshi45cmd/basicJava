package june13;

public class Student {
	String name;
	String subject;
	static String collegeName = "IES";
	
	// method area,heap area, stack area
	
	public static void learn() {
		System.out.println("all student are learning");
	}
	
public static void main(String[] args) {
	
	Student.learn();
	
	Student s = new Student();
	
	s.name = "Neha";
	s.subject = "math";
	
	System.out.println(s.name);
	System.out.println(s.subject);
	
Student s2 = new Student();
	
	s2.name = "priya";
	s2.subject = "science";
	 System.out.println(s2.name);
	 System.out.println(s2.subject);
	
	
}
}
