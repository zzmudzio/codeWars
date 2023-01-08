package pl.zzmudzio.solutions.leet_speak;


import java.util.regex.Matcher;

public class Kata {
    public static String toLeetSpeak(final String speak) {
        String speakCopy = speak + "";
        String[] words = ("A:@," +
                "B:8," +
                "C:(," +
                "E:3," +
                "G:6," +
                "H:#," +
                "I:!," +
                "L:1," +
                "O:0," +
                "S:$," +
                "T:7," +
                "Z:2").split(",");
        for (String sign : words) {
            speakCopy = speakCopy.replaceAll(String.valueOf(sign.charAt(0)),
                    Matcher.quoteReplacement(String.valueOf(sign.charAt(2))));
        }
        return speakCopy;
    }
}
