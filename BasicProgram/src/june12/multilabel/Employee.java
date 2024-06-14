package june12.multilabel;

public class Employee  extends Person {

	int employeeId;
	String department ;
	
	public void information() {
		System.out.println("employee-specific information");
	}
		
		@Override
		public void display() {
			System.out.println("name is = "+super.name);
			System.out.println("age is ="+super.age);
			
			System.out.println("Employee ID is ="+this.employeeId);
			System.out.println("Department is ="+this.department);
	}
}
