package javabeen;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Student [] arr = new  Student [5];
		
		  Address add = new Address();
		add.setCity("Bhopal");
		add.setPincode("123123");
		add.setState("MP");
		
		Student s1 = new Student( );
		s1.setId(12);
		s1.setName("neha");
		s1.setAddress(add);
		
		arr[0]=s1;
		
		Student  s22  = new Student( "Ram" , new Address("Surat", "232323","GJ"),1123 );
	     arr[1] = s22;
	     
	     Student  s3 = new Student( "Ramesh" , new Address("Mumbai", "435621","MH"),1189 );
	     arr[2] = s3;
	     
	     Student  s4  = new Student( "Mohan" , new Address("Indor", "234523","MP"),1183 );
	     arr[3] = s4;
	     
	     Student  s5  = new Student( "Raju" , new Address("Surat", "232323","GJ"),1123 );
	     arr[4] = s5;
	     
	     for(Student ss :arr) {
	    	 System.out.println(ss);
	     }
	}

}
