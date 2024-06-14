package pattern_printing;

public class numberAlphabetTriangle {

	public static void main(String[] args) {
		 
  int n = 5;
  char ch;
  int a ;
  for(int i = 1; i<=n;i++)    {
	  a = 1;
      ch = 'A';
    	  for(int j = 1; j<=i;j++) {
    		  if(i%2==0) {
    			  System.out.print(ch+" ");
    			  ch++;
    			  
    		  } else {
    			  System.out.print(a+" ");
    			  a++;
    		  }
    	  }
    	  System.out.println();
      }
	}

}
