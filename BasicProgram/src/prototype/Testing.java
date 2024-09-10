package prototype;


public class Testing {
	public static void main(String[] args) throws CloneNotSupportedException
	{
NetworkConnection  networkConnection = new NetworkConnection();
networkConnection.setIp("321.23.454");

networkConnection.loadImpdata();

System.out.println(networkConnection);
	try {
NetworkConnection pp = (NetworkConnection)networkConnection.clone();
	
System.out.println(pp.getIp());

networkConnection.setIp("00000");
System.out.println(pp.getIp());
	}
	catch(CloneNotSupportedException e)
	{
		 e.printStackTrace();
	}
	}

}
