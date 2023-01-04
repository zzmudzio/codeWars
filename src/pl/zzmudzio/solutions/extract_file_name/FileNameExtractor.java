package pl.zzmudzio.solutions.extract_file_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameExtractor {
    public static String extractFileName(String dirtyFileName) {
        System.out.print("plik:" + dirtyFileName);
        Pattern pattern = Pattern.compile("(^[0-9]+)(_)([a-zA-Z_0-9-]+)(\\.[a-zA-Z0-9-_]+)");
        Matcher matcher = pattern.matcher(dirtyFileName);
        return matcher.find() ? matcher.group(3) + matcher.group(4): null;
    }
}
