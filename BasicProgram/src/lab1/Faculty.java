package lab1;

public class Faculty  extends  Employee {
 
	String department;

	public Faculty(int employeeId, String name, double salary, String department) {
		super( );
		this.department = department;
	}

	public Faculty(int i, String string, double d) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Faculty [department=" + department + ", employeeId=" + employeeId + ", name=" + name + ", salary="
				+ salary + "]";
	}


}
