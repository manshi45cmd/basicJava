package collectionFrame;

import java.util.LinkedHashSet;

import java.util.HashMap;

public class LinkehasSet {

	public static void main(String[] args) {
		
		LinkedHashSet<String>	kk = new LinkedHashSet<String>();
		
		kk.add("neelam");
		kk.add("coco");
		kk.add("coco");
		kk.add("map");
		kk.add("moblie");
		kk.add(null);	
		kk.add(null);
		kk.add(null);
		for(String hh:kk) {
			System.out.println(hh);
		}
		
	}
}
