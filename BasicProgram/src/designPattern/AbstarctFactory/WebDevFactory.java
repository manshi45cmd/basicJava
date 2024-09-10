package designPattern.AbstarctFactory;

public class WebDevFactory extends EmployeeAbstractFactory {

	@Override
	public Employee creatEmployee() {
		// TODO Auto-generated method stub
		return new  WebDevloper();
	}

}
