package june6th;

public class Employee {
	
	int empId;
	String empDepartment;
	String slalry;
	String address;
	
	
	public Employee(int empId, String empDepartment, String slalry, String address) {
		
		this.empId = empId;
		this.empDepartment = empDepartment;
		this.slalry = slalry;
		this.address = address;
	}

	public Employee() {}
	
	public    void display () {
      System.out.print("empId--->"+empId );
      System.out.println( "empDepartment---->"+ empDepartment);
      System.out.println("salary--->"+slalry);
      System.out.println("address--->"+address);
	}
	
	public String empShift()
	{
		return "morning";
	}

}