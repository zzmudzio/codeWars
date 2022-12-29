package pl.zzmudzio.solutions.sum_of_cubes;

public class Solution {
    public static long sumCubes(long n)
    {
        long totalSum = 0;
        for(long i=1; i<=n; i++) {
            totalSum += i*i*i;
        }
        return totalSum;
    }
}

// 4 -> 1^3 + 2^3 + 3^3 + 4^3