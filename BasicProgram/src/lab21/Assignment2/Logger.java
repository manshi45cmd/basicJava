package lab21.Assignment2;

public class Logger {
	
//	private static instance
	private static Logger instance;
//	private constructor
	private Logger() {
	 
	}
	// public method to get singleton of Logger class
	public static Logger getInstance() {
		if(instance == null) {
			instance = new Logger();		
		}
		return instance;
	}
	
	// method to log message
	public void log(String message) {
		System.out.println("Logging :"+ message);
	}
	 

}
