package CoderByte;

public class Codeland_UserName_Validation {

/*    Have the function CodelandUsernameValidation(str) take the str parameter
      being passed and determine if the string is a valid username according to the following rules:

            1. The username is between 4 and 25 characters.
            2. It must start with a letter.
            3. It can only contain letters, numbers, and the underscore character.
            4. It cannot end with an underscore character.

    If the username is valid then your program should return the string true, otherwise return the string false.
    */

    public static boolean CodelandUsernameValidation(String str) {
        int n = str.length();
        // 1. The username is between 4 and 25 characters.
        if (n < 4 || n > 25) {
            return false;
        }
        // 2. It must start with a letter. - bắt đâu bằng chữ cái
        char c = str.charAt(0);
        if (!Character.isLetter(c)) {
            return false;
        }
        return false;
    }

}
























//    public static boolean CodelandUsernameValidation(String str) {
//        // Rule 1: username length between 4 and 25 characters
//        if (str.length() < 4 || str.length() > 25) {
//            return false;
//        }
//
//        // Rule 2: username starts with a letter
//        char firstChar = str.charAt(0);
//        if (!Character.isLetter(firstChar)) {
//            return false;
//        }
//
//        // Rule 3: username only contains letters, numbers, and underscore
//        for (int i = 1; i < str.length(); i++) {
//            char currChar = str.charAt(i);
//            if (!Character.isLetterOrDigit(currChar) && currChar != '_') {
//                return false;
//            }
//        }
//
//        // Rule 4: username does not end with an underscore
//        char lastChar = str.charAt(str.length() - 1);
//        if (lastChar == '_') {
//            return false;
//        }
//
//        // If all rules are satisfied, return true
//        return true;
//    }
//
//    public static void main (String[] args) {
//        // keep this function call here
//        Scanner s = new Scanner(System.in);
//        System.out.print(CodelandUsernameValidation(s.nextLine()));
//    }
