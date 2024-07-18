package stackkk;
 
	public class Box <T>{
		
	       T Container;  //object
	        Box( T Container){
	        	this.Container = Container;
	        }
	        
	        public T getValue() {
	        	return this.Container;
	        }
	        
	        public static void main(String[] args) {
				Box <String > tt = new Box<>("ViVo");
				System.out.println(tt.getValue());
				
				Box <Integer> box = new Box<Integer>( 12123);
			}

	}
	

