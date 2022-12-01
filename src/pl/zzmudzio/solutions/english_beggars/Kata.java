package pl.zzmudzio.solutions.english_beggars;


public class Kata {
    public static int[] beggars(int[] values, int n) {
        int[] beggingResult = new int[n]; // n beggars produces n results
        for(int i=1; i<=n; i++) { // counting score for each beggar
            int nCount = 0;
            while ((i + nCount * n) - 1 < values.length) {
                beggingResult[i - 1] = beggingResult[i-1] + values[(i + nCount * n) - 1];
                nCount++;
            }
        }
        return beggingResult;
    }
}

/*

[1,2,3,4,5,6,7]
1 ==>  1 + 0 * n, 1+ 1 * n, 1+ 2 * n -> 1, 4, 7 //indices


 */

