package TakeInput;
import java.util.*;

public class IntString {
	public static void main(String[] args) {
		 System.out.println("Enter a input");
		Scanner scn = new Scanner(System.in);
		int  n = Integer.parseInt(scn.nextLine());
		String name = scn.nextLine();
		
		System.out.println("dear " + name +" counting start");
		for(int i = 0;i<=n;i++)
		{
			System.out.println(i);
			
		}
	}

}
