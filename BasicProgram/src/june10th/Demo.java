package june10th;

public class Demo {
 public static void main(String[] aegs) {
	 Address add1 = new Address();
	 add1.setCity( "BHOPAL");
	 add1.setDistrict( "bhopal");
	 add1.setPincode("464223");
	 add1.setState( "MP");
	 
	 Student s1 = new Student();
	 s1.setS_Id(101);
	 s1.setS_Name( "Manshi");
	 s1.setS_Address(add1);
	 System.out.println(s1.getS_Address().getCity());
	 
	 System.out.println(s1.getS_Id());
 }
}
