package june12.multilabel;

public class Person {
	
	 protected String name;
	 protected int age;
	 
	
	
	public void  information() {
		System.out.println("personal information");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void display () {
		System.out.println("age of person is"+this.age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
	
	
	
	
	
	

}
