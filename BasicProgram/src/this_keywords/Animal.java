package this_keywords;

public class Animal {
	
	void saftey() {
		System.out.println("saftey chanching is done");
	}
	// this ko current class ki method ko call krne ke liye bhi use call karte h
	
	void eat() {
		
		this.saftey(); // we are using this as instance
		System.out.println("they are eating somthing");
	}
	
	public static void main(String[] args) {
		Animal s = new Animal();
//		s.saftey();
		s.eat();
	}

}
