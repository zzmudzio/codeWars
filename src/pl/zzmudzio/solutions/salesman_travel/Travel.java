package pl.zzmudzio.solutions.salesman_travel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Travel {
    public static String travel(String r, String zipcode) {
        if(zipcode.equals("")) return ":/";
        String streetsOfgivenZipCode = zipcode.concat(":");
        String streetsNumbers = "/";
        String[] singleAddress = r.split(",");
        Pattern streetNrNameZipCodePattern = Pattern.compile("(^[0-9]+)([a-zA-Z\\D]+[a-z])\\s("+zipcode+")$");
        Matcher streetMatcher;
        for (String element : singleAddress) {
            streetMatcher = streetNrNameZipCodePattern.matcher(element);
            if (streetMatcher.find()) {
                streetsOfgivenZipCode = streetsOfgivenZipCode.concat(streetMatcher.group(2).trim()+",");
                streetsNumbers = streetsNumbers.concat(streetMatcher.group(1)+",");
            }
        }
        return streetsOfgivenZipCode.
                replaceAll(",$", "")
                .concat(streetsNumbers.replaceAll(",$",""));
    }
}

/*

123 Main Street St. Louisville OH 43071,432 Main Long Road St. Louisville OH 43071
"OH 43071:Main Street St. Louisville,Main Long Road St. Louisville/123,432"

*/