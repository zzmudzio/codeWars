package pl.zzmudzio.solutions.persistent_bugger;

public class Persist {
    public static int persistence(long n) {
        if ((n >= 0 && n < 10) || (n <= -1 && n > -10)) {
            return 0;
        }
        String numberAsString = String.valueOf(n); // 39
        int counter = 0;
        long result = 1;
        while(numberAsString.length() > 1) {
            for(int i=0; i<numberAsString.length(); i++) {
                result *= Integer.parseInt(Character.toString(numberAsString.charAt(i)));
            }
            numberAsString = String.valueOf(result);
            result = 1;
            counter++;
        }
        return counter;
    }
}
