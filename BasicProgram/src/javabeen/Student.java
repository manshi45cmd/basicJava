package javabeen;

public class Student {
	
	  private  String name;
	   private String address;
	   private int id;
	 
	public Student(String name, Address address2, int id) {
		super();
		this.name = name;
		this.address = address;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", id=" + id + "]";
	}

	public void setAddress(Address add) {
		// TODO Auto-generated method stub
		
	};
	
	
}