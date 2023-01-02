package pl.zzmudzio.solutions.word_a10n;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abbreviator {
    public static String abbreviate(String string) {
        Pattern pattern = Pattern.compile("([a-zA-Z]{4,})([!@#$%^&*()-=_+;:',.\\/<>?\\s])*");
        Matcher matcher = pattern.matcher(string);
        String tmpString = "";
        while (matcher.find()) {
            tmpString = matcher.group(1);
            tmpString = tmpString.charAt(0)
                    + String.valueOf((tmpString.substring(1,tmpString.length() - 1)).length())
                    + tmpString.charAt(tmpString.length()-1);
            string = string.replaceFirst(matcher.group(1), tmpString);
        }
        return string;
    }
}

// elephant-rides are really fun!

// rides - 0,1,2,3,4