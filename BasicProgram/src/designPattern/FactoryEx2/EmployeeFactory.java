package designPattern.FactoryEx2;

import designPattern.AbstarctFactory.WebDevloper;

public class EmployeeFactory {
	
	
	
	public static Employee getEmployee(String EmpType) {
		
		if(EmpType.trim().equalsIgnoreCase("Android")) {
			
			return new AndriodDeveloper();
		}
		
		 
		
		else if(EmpType.trim().equalsIgnoreCase("Web")) {
			return new WebDeveloper();
		
	}else {
		return null;
	}
	  
	}

	public static void getEmployee(WebDevloper webDevloper) {
		// TODO Auto-generated method stub
		
	}

}
