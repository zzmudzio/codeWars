package pl.zzmudzio.solutions.insert_dashes;

import java.util.Arrays;

public class Solution {
    public static String insertDash(int num) {
        String[] number = String.valueOf(num).split("");
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) break;
            else if (Integer.parseInt(number[i]) % 2 != 0 && Integer.parseInt(number[i+1]) % 2 != 0) {
                number[i] = number[i] + "-";
            }
        }
        return String.join("", number);
    }
}
// 454793