package june24.Final;

public class Student {
	int rollnumber;
	String name;
	final String college = "SNGGPG";
	
	public Student(String  name) {
		this.college = name;
	}
		

	
	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", college=" + college + "]";
	}



	public static void main(String[] args) {
		
		Student s = new Student("NRI");
		s.name= "Neha";
		s.rollnumber = 1212;
		//s.college = "SNGGPG";
		System.out.println(s);
		
		Student s1 = new Student("SAG");
		s1.name= "rahul";
		s1.rollnumber = 1245;
		//s.college = "SNGGPG";
		System.out.println(s1);
	}

}
