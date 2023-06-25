package CoderByte;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ABCheck {

    private static String abCheck(String str) {
        Pattern pattern = Pattern.compile("(a...b|b...a)");
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "true" : "false";
    }

    /**
     * Entry point.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        String result1 = abCheck("lane borrowed");
        System.out.println(result1);
        String result2 = abCheck("australia");
        System.out.println(result2);
    }
}
