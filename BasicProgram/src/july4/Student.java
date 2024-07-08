package july4;

public class Student {

	   String name;
	  String address;
	   int id;
	
	 

	public Student(String name, String address, int id) {
		super();
		this.name = name;
		this.address = address;
		this.id = id;
	}
		

public Address add = new Address() {};
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

	 
}
