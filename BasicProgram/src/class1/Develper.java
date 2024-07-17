package class1;

public class Develper  extends Employee{
	private String programmingLanuage;

	public Develper(String name, String address, double salary, String jonTitle, String programmingLanuage) {
		super(name, address, salary, jonTitle);
		this.programmingLanuage = programmingLanuage;
	}
	
	public Develper () {
		
	}
	

}

class Programmer extends Develper {
	 private int projectsCompleted;

	public Programmer(String name, String address, double salary, String jonTitle, String programmingLanuage,
			int projectsCompleted) {
		super(name, address, salary, jonTitle, programmingLanuage);
		this.projectsCompleted = projectsCompleted;
	}
	 
	 
	
}

 
