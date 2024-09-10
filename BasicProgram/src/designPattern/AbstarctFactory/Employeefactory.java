package designPattern.AbstarctFactory;

public class Employeefactory {
	
	// get employee
	
	public static Employee grtEmployee(EmployeeAbstractFactory factory) {
		
		
		return factory.creatEmployee();
		
	}

}
