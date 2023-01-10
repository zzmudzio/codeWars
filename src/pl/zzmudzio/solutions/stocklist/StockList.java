package pl.zzmudzio.solutions.stocklist;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StockList {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if(lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";
        StringBuilder resultString = new StringBuilder("");
        Pattern pattern;
        Matcher matcher;
        int sumOfBooks = 0;
        for (String categoryLetter : lstOf1stLetter) {
            sumOfBooks = 0;
            pattern = Pattern.compile("(^[" + categoryLetter + "])([A-Z]+)\\s([0-9]+)");
            for (String item : lstOfArt) {
                matcher = pattern.matcher(item);
                if (matcher.find()) {
                    sumOfBooks += Integer.parseInt(matcher.group(3));
                }
            }
            if (sumOfBooks == 0) resultString.append("(").append(categoryLetter).append(" : ").append("0)");
            else {
                resultString.append("(").append(categoryLetter).append(" : ").append(sumOfBooks).append(")");
            }
        }
        return resultString.toString().replaceAll("(\\))(\\()", "$1 - $2");
    }
}
