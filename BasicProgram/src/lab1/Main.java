package lab1;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1  = new Employee();
		emp1.employeeId = 1232;
		emp1.name = "prachi";
		emp1.salary = 20000.00;
		
		Faculty f1 = new Faculty(3231,"Roshan", 26000.00);
		
		Staff s1 = new Staff(4312," Saloni",40000.00,"IT");
		
    System.out.println(emp1);
    System.out.println(f1);
	System.out.println(s1);	
	}
      
}
