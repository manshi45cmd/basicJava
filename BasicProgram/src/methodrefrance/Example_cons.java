package methodrefrance;

public class Example_cons {

	public static void main(String[] args) {
		
	 

		DoingStudentOperation obj = Student::new;

		System.out.println(obj.addStudent(null));
		;
	}

}
