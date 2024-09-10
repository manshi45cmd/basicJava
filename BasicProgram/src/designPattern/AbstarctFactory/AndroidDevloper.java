package designPattern.AbstarctFactory;

public class AndroidDevloper implements Employee {
	
	 public int salary() {
		 return 5000;
	 }

	@Override
	public String name () {
		 System.out.println(" I am Android Developer");
		return  "ANDROID DEVELOPER"; 
	}

}
