package CoderByte;

public class SwapCase {
/*      Have the function SwapCase(str) take the str parameter
      and swap the case of each character.
      For example: if str is "Hello World" the output should be hELLO wORLD.
      Let numbers and symbols stay the way they are.*/

/*    Ví dụ: nếu str là "Hello World" thì đầu ra phải là hELLO wORLD.
      Hãy để các con số và ký hiệu giữ nguyên như cũ.*/

    public static String caseSwap(String str) {
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            if (Character.isLowerCase(c)) { // This method returns true, if the passed character is really in lowercase.
                stringBuilder.append(Character.toUpperCase(c));  // convert -> chữ hoa
            } else {
                stringBuilder.append(Character.toLowerCase(c));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = caseSwap("Thong Bem AHIhi");
        System.out.println(s);
    }
}
