package lab12;

import java.util.ArrayList;

public class Container <T>    {
private ArrayList <T> collection = new ArrayList<> ();
	
	public void add(T obj ) {
		collection.add(obj);
	}
	
	public void remove (T obj) {
		collection.remove(obj);
	}
	
	public T get (int index ) {
		return collection.get(index);
	 
	}
	
	public T size(int number) {
		return collection.get(number);
	}
	
}

