package designPattern.AbstarctFactory;

import designPattern.FactoryEx2.EmployeeFactory;

public class Client {
	
	public static void main(String[] args) {
		
		// i want to get android developer
		
		Employee e1 = EmployeeFactory.getEmployee( new AndroidDevloper());
		e1.name();
		EmployeeFactory.getEmployee(new WebDevloper());
		
	}

}
