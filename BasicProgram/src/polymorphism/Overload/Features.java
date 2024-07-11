package polymorphism.Overload;

public class Features {
	
	int  add(int a,int b) {
		
		return   a+b;
		  	
	}
      void add(double a,double b) {
    	  System.out.println(a+b);
      }
      
      class Test{
    	  public static void main(String[] args) {
    		  
    		  Features f1 = new Features();
			 f1.add( 6,4);
			 System.out.println(f1);
			  Features f2 = new Features();
			  f2.add(2.3, 3.2);
			 // System.out.println();
		}
      }
}
