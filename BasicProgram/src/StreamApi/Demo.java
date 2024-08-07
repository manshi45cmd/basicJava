package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<>();
		
		num.add(20);
		num.add(25);
		num.add(37);
		num.add(50);
		num.add(77);
		
		for( Integer num2 : num) {
			if(num2 % 2 == 0) {
				num2.add(num + 5);
				
			}else {
				num.add(num);
				
			}
		}
	}

}
