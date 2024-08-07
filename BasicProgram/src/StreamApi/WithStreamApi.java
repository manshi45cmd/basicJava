package StreamApi;
 
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WithStreamApi {
	private static int sum;

	public static void main(String[] args) {
		
		 List<Product> list = new ArrayList<>();
		 list.add(new Product(1,"jeans1",3500));
		 list.add(new Product(2,"shirt",500));
		 list.add(new Product(3,"TV",3500));
		 list.add(new Product(4,"mixer",3500));
		 list.add(new Product(5,"Fridge",15500));
		 list.add(new Product(6,"iphone",11300));
		 list.add(new Product(7,"car",350000));
		 
 List<Integer> listOfPrice  =   list.stream()
				                    .filter(p -> p.price > 3000)
				                    .map(p ->  (int) p.price)
				                    .collect(Collectors.toList());
 
 System.out.println(listOfPrice);
 
  List<Integer> listOfPricee = new ArrayList<>();
  
  Integer tototalSum = list.stream().filter(p -> p.price>3000)
		                       .peek(l -> listOfPricee.add(l.price) )
		                       .mapToInt(o -> o.price)
		                        .sum();
 
  System.out.println(tototalSum);
	}

} 
// create a Array list of integer than add number less than 100
// add 5 number in  each than create new Array list
// if odd than 
 