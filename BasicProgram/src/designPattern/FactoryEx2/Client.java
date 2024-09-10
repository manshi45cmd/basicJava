package designPattern.FactoryEx2;

public class Client {
	
	public static void main(String[] args) {
		 
	 Employee ee1 = EmployeeFactory.getEmployee("Android");
		
		 System.out.println(ee1);
		 int salary = ee1.getSalary();
		 System.out.println("Salary : " + salary);
		
		 Employee ee2 = EmployeeFactory.getEmployee("Web");
		 System.out.println(ee2);
		 int salary2 = ee2.getSalary();
		 System.out.println(salary2);
	}

}
