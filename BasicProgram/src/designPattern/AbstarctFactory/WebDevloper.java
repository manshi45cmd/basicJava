package designPattern.AbstarctFactory;

public class WebDevloper implements Employee {
	
	 public int salary() {
		 return 10000;
	 }

	@Override
	public String name() {
		 System.out.println(" I am Web Developer");
		return  " WEB DEVELOPER"; 
	}

}
