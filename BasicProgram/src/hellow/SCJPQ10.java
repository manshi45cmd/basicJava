package hellow;

public class SCJPQ10 implements Runnable {

public void run() {

}

}

class Y {

public static void main(String args[]) {

Thread th1 = new Thread(); //1

Thread th2 = new Thread(new SCJPQ10()); //2

Thread th3 = new Thread(new SCJPQ10(), "X"); //3

Thread th4 = new Thread("X"); //4

}


}

 

		
