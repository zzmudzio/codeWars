package pl.zzmudzio.solutions;

import com.google.common.math.IntMath;
import pl.zzmudzio.solutions.steps_in_primes_kata.StepInPrimes;

public class Main {
    public static void main(String[] args) {
        long[] result = StepInPrimes.step(2,10000000, 11000000);
        for(long element : result) {
            System.out.print(element);
        }
    }
}



