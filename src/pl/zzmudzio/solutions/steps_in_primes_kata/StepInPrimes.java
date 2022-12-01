package pl.zzmudzio.solutions.steps_in_primes_kata;

import java.util.List;
import java.util.stream.IntStream;


public class StepInPrimes {
    public static long[] step(int g, long m, long n) {
        List<Integer> primeNumbers = IntStream.rangeClosed((int) m, (int) n)
                .filter((number) -> IntMath.isPrime(number))
                .boxed()
                .toList();
        for(int i=0; i<primeNumbers.size(); i++) {
            for(int j=i+1; j<primeNumbers.size(); j++) {
                if(primeNumbers.get(j) - primeNumbers.get(i) == g) return new long[]{primeNumbers.get(i),
                primeNumbers.get(j)};
            }
        }
        return null;
    }
}
