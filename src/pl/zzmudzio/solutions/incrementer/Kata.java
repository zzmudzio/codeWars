package pl.zzmudzio.solutions.incrementer;

public class Kata {
    public static int[] incrementer(int[] numbers) {
        if(numbers.length == 0 ) return new int[]{};
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = (numbers[i] + (i+1)) >= 10?
                    (numbers[i] + (i+1)) % 10 : numbers[i] + (i+1);
        }
        return numbers;
    }
}

