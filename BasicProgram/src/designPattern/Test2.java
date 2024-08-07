package designPattern;

import lab10.Main;

public class Test2 {
 public static void main(String[] args) throws Exception,CloneNotSupportedException {
	
	 SingleDesignPattern firstobj =SingleDesignPattern.getInstance();
	 System.out.println(firstobj.hashCode());
	 /*
	  * 
	  */
	 SingleDesignPattern secobj =(SingleDesignPattern)  firstobj.clone();
	 
	 System.out.println(secobj.hashCode());
}

}
