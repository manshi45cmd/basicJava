package june11;

public class WashingMatchine  extends Appliance{
	
	private int size;
	private String capacity;
	
	public void matchineOn() {
		System.out.println("maichine is start");
	}
	
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public WashingMatchine (int size ,String capacity) {
		this.size = size;
		this.capacity= capacity;
	}
	
	public WashingMatchine() {}


	public WashingMatchine(String brandName, double price, int size, String capacity) {
		super(brandName, price);
		this.size = size;
		this.capacity = capacity;
	}


	@Override
	public String toString() {
		return "WashingMatchine [size=" + size + ", capacity=" + capacity + ", getSize()=" + getSize()
				+ ", getCapacity()=" + getCapacity() + "]";
	}
	
	
	
	
	


}
