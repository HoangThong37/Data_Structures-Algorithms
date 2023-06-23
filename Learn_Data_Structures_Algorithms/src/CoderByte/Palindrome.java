package CoderByte;

public class Palindrome {

    static String Palindrome1(String str) {
        int n = str.length();
        str = str.replace(" ", "");

        String reverse = "";
        for (int i = n - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        boolean isPalindrome1 = true;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != reverse.charAt(i)) {
                isPalindrome1 = false;
            }
        }
        if (isPalindrome1) {
            return "true";
        } else {
            return "false";
        }
    }

    //
    String checkPalindrome(String str) {
        StringBuffer buffer = new StringBuffer();
        for(char ch: str.toCharArray())
        {
            if(Character.isDigit(ch) || Character.isLetter(ch))
                buffer.append(ch);
        }
        int length = buffer.length();
        for(int i = 0; i < length / 2; i++)
        {
            if(buffer.charAt(i) != buffer.charAt(length - ( i + 1 )))
                return "false";
        }
        return "true";
    }

    public static String Palindrome(String str) {
        // code goes here
        // Remove non-alphanumeric characters
        String strProcessed = str.replaceAll("[^a-zA-Z0-9]", "");

        // Check for inequality in pairs
        int strProcessedLength = strProcessed.length();
        for (int index = 0; index <= strProcessedLength / 2; index++) {
            if (strProcessed.charAt(index) != strProcessed.charAt(strProcessedLength - 1 - index)) {
                return "false";
            }
        }
        // If no inequality, must be palindrome
        return "true";
    }

    public static void main(String[] args) {
        String test = "abc cba";
        Palindrome(test);
    }
}
