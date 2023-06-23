package CoderByte;

public class LongestWord {

    public static String LongestWord(String sen) {
        String[] arrStr = sen.split(" ");
        String largestStr= "";
        for(String item : arrStr) {
            if(item.length() > largestStr.length()) {
                largestStr = item;
            }
        }
        System.out.println(largestStr);
        return largestStr;
    }

    public static void main (String[] args) {
        // keep this function call here
        String a = "fun&!! time";
        LongestWord(a);
    }
}
