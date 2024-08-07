package lab10;
import java.util.concurrent.*;
public class SumCalculator implements Callable<Integer> {
    private int n;

    public SumCalculator(int n) {
        this.n = n;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

 


