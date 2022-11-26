package pl.zzmudzio.solutions.new_cashier_kata;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static String getOrder(String input) {
        List<String> menu = Arrays.asList("burger", "fries", "chicken", "pizza", "sandwich", "onionrings",
                "Milkshake", "Coke");
        String correctedOrder = "";
        for(String menuItem: menu) {
            Pattern menuPosition = Pattern.compile(menuItem.toLowerCase());
            Matcher match = menuPosition.matcher(input);
            while(match.find()) {
                correctedOrder = correctedOrder
                        .concat(capitalize(input.substring(match.start(), match.end()))+" ");
            }
        }
        return correctedOrder.trim();
    }
    public static String capitalize(String word) {
        return String.valueOf(word.charAt(0)).toUpperCase() + word.substring(1);
    }
}
