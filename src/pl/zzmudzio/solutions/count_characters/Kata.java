package pl.zzmudzio.solutions.count_characters;

public class Kata {
    public static int[] Solve(String word) {
        int[] signsCounter = {0, 0, 0, 0}; // Count of: {upperCase, lowerCase, numbers, special characters}
        word
                .chars()
                .forEach(charCode ->
                {
                    if(charCode >= 65 && charCode <= 90) signsCounter[0]++;
                    else if(charCode >= 97 && charCode <= 122) signsCounter[1]++;
                    else if(charCode >= 48 && charCode <= 57) signsCounter[2]++;
                    else signsCounter[3]++;
                });
        return signsCounter;
    }
}
