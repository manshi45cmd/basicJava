package june6th;

public class basic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e0 = new Employee();
		
		Employee e1 = new Employee();
		
		e1.empId = 101;
		e1.empDepartment = "Finance";
		e1.slalry = "15000";
		e1.address = "bhopal"; 
		
//		System.out.(e1.display());
		System.out.println(e1.empShift());
		 
        Employee e2 = new Employee();
        e2.empId = 102;
		e2.empDepartment = " IT";
		e2.slalry = "15000";
		e2.address = "bhopal"; 
		
		Employee e3 = new Employee();
		e3.empId = 103;
		e3.empDepartment = "Finance";
		e3.slalry = "15000";
		e3.address = "bhopal"; 
		
		//Employee e4 = new Employee(104,"hr","mumbai","10000");
		e1.display();
		System.out.println("=========================");
		e2.display();
		System.out.println("=========================");
		e3.display();
		System.out.println("=========================");
		
		        
		

	}

}