package array;

public class Test11 {
	 
	
		private static int count;
 
	public static int print( String name) {  
		
			 
			name = "Monalisha";
			
	char	i  =	name.charAt(count);  // convert string to char
			 
		char[] arr =   {'a','e','i' ,'o','u'};  // creating a array
		 
		for(int j = 0; j<arr.length;j++) { // traversing the array
				 
			 
			if( i ==   j ) {  // check i is equal to j 
				 
				
				count++;  // increment count 
			  
			}
			   
		}
			 
			  
			 return count;
				
		} 
	public static void main(String[] args) {
		print( " Monalisha" );
	}
		
	 
		}


		 	 

