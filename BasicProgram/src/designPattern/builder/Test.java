package designPattern.builder;

public class Test {

	public static void main(String[] args) {
		
		User user1 = new User.UserBuilder()
				.setUserId("123")
				.setUserName("Pavan")
				.Build();
		
		System.out.println(user1.getUserId());
		
		System.out.println(user1);
	}
}
