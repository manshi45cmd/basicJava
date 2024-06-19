package june14_finalketword;

public class june14_Static {
	
	static class car {
		String type;
		
	}
	int tyre;
	String color;
	void run() {
		System.out.println("car is running");
	}
	public static void main(String[] args) {
		june14_Static c1 = new june14_Static();
		c1.color= "blue";
		System.out.println(c1.color);
	}

}
