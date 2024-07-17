package class1;

public   class Employee {
	String name;
	String address;
	double salary;
	String jonTitle;
	public Employee(String name, String address, double salary, String jonTitle) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.jonTitle = jonTitle;
		
	 
	}
	public Employee() {
		
	}
	
	public   double calculateBonus() {
		return salary *1.12;
		
	}
	
	 

}
