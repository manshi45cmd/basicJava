package june12.multilabel;

public class Manager extends Employee {
	
	int teamSize;
	
	public void information() {
		System.out.println("manager-spacific information");
	}
	
	public void display() {
		
      System.out.println("");
		
		System.out.println("team size is ="+this.teamSize);
	}

}
