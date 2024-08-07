package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class WithOutStream {
	
	 

	public static void main(String[] args) {
		
		 List<Product> list = new ArrayList<>();
		 list.add(new Product(1,"jeans1",3500));
		 list.add(new Product(2,"shirt",500));
		 list.add(new Product(3,"TV",3500));
		 list.add(new Product(4,"mixer",3500));
		 list.add(new Product(5,"Fridge",15500));
		 list.add(new Product(6,"iphone",11300));
		 list.add(new Product(7,"car",350000));
		 
		 ArrayList<Integer> ss = new ArrayList<>();
		 
		 int sum = 0;
		  for(Product p : list) {
			  if(p.price > 3000)
			  {
				  ss.add((int) p.price);
				  
				  sum += p.price;
			  }
		 }
		 System.out.println(ss);
		  System.out.println(sum);
	}


}
