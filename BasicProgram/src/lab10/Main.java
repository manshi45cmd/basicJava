package lab10;
import java.util.*;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	
	 
	    public static void main(String[] args) throws InterruptedException, ExecutionException {
	        ExecutorService executor = Executors.newFixedThreadPool(3);

	        Callable<Integer>[] tasks = new Callable[] {
	                new SumCalculator(10),
	                new SumCalculator(20),
	                new SumCalculator(30),
	                new SumCalculator(40),
	                new SumCalculator(50)
	        };

	        for (Callable<Integer> task : tasks) {
	            Future<Integer> future = executor.submit(task);
	            System.out.println("Result: " + future.get());
	        }

	        executor.shutdown();
	    }
	}


