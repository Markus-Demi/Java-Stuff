package by.itacademy.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String str = "hop hey helolooooloooo hellloooooo jiiiigurdaaaaa ahahaha";

        Pattern pattern = Pattern.compile("(.)\\1+");
        Matcher matcher = pattern.matcher(str);

        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, matcher.group().substring(0, 1) + (matcher.end() - matcher.start()));
        }
        matcher.appendTail(stringBuffer);
        System.out.println(stringBuffer.toString());
    }
}
