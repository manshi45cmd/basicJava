package collectionFrame;

import java.util.TreeSet;

public class TreeSett {
	
	public static void main(String[] args) {
		TreeSet<Integer>  tt = new TreeSet<Integer>();
		tt.add(null);
		tt.add(10);
		tt.add(null);
		tt.add(10);
		tt.add(30);
		tt.add(80);
		
		for(Integer hh:tt) {
			System.out.println(tt);
		}
		
		
	}

}
