package june11;

public class Fridge extends Appliance {
	
	private int size;
	private String capacity;
	
	public void  frideOn() {
		System.out.println(" cooling is start");
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
	
	public Fridge () {};
	
	public Fridge(int size,String capacity) {
		this.size = size;
		this.capacity = capacity;
	}
	
	
//	public Fridge(String brandName,double price) {
//		
//	}
//	

	@Override
	public String toString() {
		return "Fridge [size=" + size + ", capacity=" + capacity + ", getSize()=" + getSize() + ", getCapacity()="
				+ getCapacity() + "]";
	}

	
	
	
	
}
