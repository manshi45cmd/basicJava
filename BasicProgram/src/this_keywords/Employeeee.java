package this_keywords;

public class Employeeee {
	
	private String name;
	public void setName (String mm) {
		this.name = mm;
	}


private Employeeee(int salary) {
	
	System.out.println("salary is transfered "+salary);
	
}

public  Employeeee(int rupees,String ID){
	this(rupees);
	System.out.println("work has been done");
}
 // this keyword ka use private class constuctor ko creat kr sakte h
// variable ki value ko access kr sakte h
}
