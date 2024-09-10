package designPattern.builderEx2;

import designPattern.builder.User;

public class Computer {
	private  String HDD;
	private String RAM;
	
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	private Computer (ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		
	}
	
	public String getHDD() {
		return HDD;
	}
	public String getRAM() {
		return RAM;
	}
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	
	
	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}



	static class  ComputerBuilder {
		private String HDD;
		private String RAM;
		
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		
		public ComputerBuilder() {
			
		}


		public ComputerBuilder setHDD(String hDD) {
			this.HDD = hDD;
			return this;
			
		}


		public ComputerBuilder setRAM(String rAM) {
			this.RAM = rAM;
			return this;
		}


		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}


		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		} 
		
		
		public Computer build() { // method
			Computer u = new  Computer(this);
			return u;
       }
		
		
	}
	 
	

}
