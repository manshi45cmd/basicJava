package designPattern.Factory;

public class WebDeveloper implements Employee
{

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		
		System.out.println("Salary of web Developer ");
		return 60000;
	}

}
