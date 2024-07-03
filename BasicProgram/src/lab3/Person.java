package lab3;

public class Person {
	
	private int age = 17;
	
	public  Person(int age)throws InvalidAgeException {
		
		 if(age <18  || age > 100 ) {
			 throw new InvalidAgeException("valid age");
			 
		 }
		 else {
			 System.out.println("invalid age");
		 }
 
	} 
	public Person() {
		 
	} 
	public int getAge() {
		return age;
	} 
	public void setAge(int age) {
		this.age = age;
	}

}
