package pattern_printing;

public class RactangleStar {

	public static void main(String[] args) {
		//int n = 5;
		// TODO Auto-generated method stub
          for(int i = 1; i<=5;i++) {
        	  for(int j = 1; j<=10;j++) {
        		 // int a = n/2+1;
        		  
        		  if(i==1||j==1) {
        			  System.out.print("*");
        			  
        		  } else if (i==5||j==0) {
        			  System.out.print("*");
        		  } 
        		  else if  (j==9)
        		  {
        			  System.out.print("*");
        		  }
        		   
        		  
        		  
        		  else 
        		  { System.out.print("");
        			  
        		  }
        		  
        	  } System.out.println();
          }
	}

}
//

//************
//*		     *
//*          *
//*          *
//************
