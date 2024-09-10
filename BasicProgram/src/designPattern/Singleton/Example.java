package designPattern.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Example { 
	
  public static void main(String[] args) throws Throwable, SecurityException {
//	  
// Samosa samosa = Samosa.getSamosa();
// System.out.println(samosa.hashCode());
//		
// Samosa samosa2 = Samosa.getSamosa();
// System.out.println(samosa2.hashCode());
//		
//		
// System.out.println(Jalebi.getJalebi().hashCode());
// System.out.println(Jalebi.getJalebi().hashCode());
 
 
 
 
 // break singleton using reflection API 
// Samosa s1 = Samosa.getSamosa();
// System.out.println(s1.hashCode());
// 
// Constructor<Samosa> cons;
// 
// 
// cons = Samosa.class.getDeclaredConstructor();
// cons.setAccessible(true);
// Samosa s2 = cons.newInstance();
// System.out.println(s2.hashCode());
// 
// SoluctionBreakSinglRAPI s3 = SoluctionBreakSinglRAPI.INSTANCE;
// s3.test();
// 
// System.out.println(s3.hashCode());
	  
	  
	  
	  // break singleton using  Deserialization 
	  
//	  Samosa samosa1 = Samosa.getSamosa();
//	  System.out.println(samosa1.hashCode());
//  ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
//  oos.writeObject(samosa1);
//  System.out.println("serialization Done...");
//  ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
//  
//  Samosa ss2 =(Samosa) ois.readObject();
//  System.out.println(ss2.hashCode());
  
  
  // break singleton using cloning
  Samosa samosa = Samosa.getSamosa();
 System.out.println(samosa.hashCode());
 
 System.out.println("After cloning");
 
 Samosa s2 = (Samosa)samosa.clone();
 System.out.println(s2.hashCode());

  
	   
 
 
 
  
 
	 }

}
