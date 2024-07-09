package july9.stringbuffer;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s = new StringBuffer(" vaishali ");//single thraded and thrad safe
		
		s = s.append(" Namdev ");
		
		for(int i = 0; i<5;i++) {
			 s.append(i);
		}
		
      System.out.println(s);
      
      s.reverse();
      System.out.println(s);
      
      
      StringBuilder gg = new StringBuilder("Lankesh");//you can use multiple thrad in this
      // this is not thrad safe 
      
	}

}