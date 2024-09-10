package designPattern.builder;

public class User {
	
	private final String userId;
	private  final String userName;
	private  final String userEmail;
	
	// constructor
	private User(UserBuilder builder) {
		
	    this.userId = builder.userId;
		this.userEmail = builder.userEmail;
		this.userName = builder.userName;
	}
   
	public String getUserId() {
		return userId;
	}
 
	public String getUserName() {
		return userName;
	}
 
	public String getUserEmail() {
		return userEmail;
	} 
	  
	// inner class to create a object ;

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + "]";
	} 
	static class UserBuilder {
		
		private String userId;
		private String userName;
		private String userEmail;
		
		
		public UserBuilder() { // constructor
		 
		}

		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}

		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public UserBuilder setUserEmail(String userEmail) {
			this.userEmail = userEmail;
			return this;
		}
		 
			public User Build() { // method
				User u = new User(this);
				return u;
           }
	}

}
