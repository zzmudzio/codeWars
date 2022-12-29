package pl.zzmudzio.solutions.athletics_statistics;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stat {
    public static String stat(String strg) {
        if (strg.isEmpty()) {
            return "";
        }
        List<String> correctedResults = correctResultsList(strg);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return "Range: " + getRange(correctedResults).format(dateTimeFormatter).replaceAll(":", "|")
                + " Average: " + getAverage(correctedResults).format(dateTimeFormatter).replaceAll(":", "|") +
                " Median: " + getMedian(correctedResults).format(dateTimeFormatter).replaceAll(":", "|");
    }

    public static LocalTime getRange(List<String> results) {
        return LocalTime.parse(results.get(results.size() - 1))
                .minusNanos(LocalTime.parse(results.get(0)).toNanoOfDay());
    }

    public static LocalTime getAverage(List<String> results) {
        int totalSeconds = 0;
        for (String singleResultTime : results) {
            totalSeconds += LocalTime.parse(singleResultTime).toSecondOfDay();
        }
        return LocalTime.ofSecondOfDay(totalSeconds / results.size());
    }

    public static LocalTime getMedian(List<String> results) {
        if(results.size() % 2 != 0) {
            return LocalTime.parse(results.get((int)Math.ceil(results.size()/2)));
        }
        else {
            return LocalTime.ofSecondOfDay((LocalTime.parse(results.get((results.size()/2)-1)).toSecondOfDay() +
                    LocalTime.parse(results.get(results.size()/2)).toSecondOfDay())/2);
        }
    }

    public static List<String> correctResultsList(String strg) {
        List<String> splittedSingleResult = new ArrayList<>();
        String[] tmpArray;
        for (String result : strg.split(",")) {
            tmpArray = result.trim().split("\\|");
            for (int i = 0; i < tmpArray.length; i++) {
                tmpArray[i] = tmpArray[i].replaceAll("(^[0-9]$)", "0$1");
            }
            splittedSingleResult.add(String.join(":", tmpArray));
        }
        Collections.sort(splittedSingleResult);
        System.out.println(splittedSingleResult.toString());
        return splittedSingleResult;
    }
}

// 1 2 3 4