package prototype;
 
public class NetworkConnection  implements  Cloneable{

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	private String  impData;
	private String ip;
	
	public NetworkConnection(String impData, String ip) {
		super();
		this.impData = impData;
		this.ip = ip;
	}

	public String getImpData() { 
		return impData;
	}

	public void setImpData(String impData) {
		this.impData = impData;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public void loadImpdata() {
		this.impData =  " very very imp data ";
	}
	
	public NetworkConnection() {
		
	}

	@Override
	public String toString() {
		return "NetworkConnection [impData=" + impData + ", ip=" + ip + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	
}
