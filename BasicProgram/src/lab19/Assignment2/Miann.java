package lab19.Assignment2;
 
public class Miann {

	
public static void main(String[] args) {
	
 // StringManipulate using lambda Expression
	
StringManipulate str = name -> name.toUpperCase();
StringManipulate str1 = name -> name.toLowerCase();
StringManipulate str2 = name -> new StringBuilder(name).reverse().toString();

// printing the  lambda Expression
System.out.println("Convert the string to uppercase :" + str.string("manshi"));

System.out.println("Convert the string to lowerrcase :" + str1.string("MANSHI"));
		
System.out.println("reverse the string  :" + str2.string("manshi"));
	} 
}
