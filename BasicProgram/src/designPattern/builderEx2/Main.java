package designPattern.builderEx2;

public class Main {
	public static void main(String[] args) {
		
		Computer com = new Computer.ComputerBuilder()
				.setHDD("hhh")
				.setBluetoothEnabled(true)
				.build();
		
		
		System.out.println(com.getHDD());
		
		System.out.println(com);
	}

}
