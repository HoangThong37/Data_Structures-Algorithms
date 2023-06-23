package CoderByte;

public class LetterCapitalize {

    // String s = "thong bem ahi"
    // ruturn - Thong Bem Ahi.

    private static String letterCapitalize(String str) {
        String[] arr = str.split(" "); // tách chuỗi thành 1 mảng - khoảng trống

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].isEmpty()) {
                arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
            }
        }
        return String.join(" ", arr);
    }

    public static void main(String[] args) {
       String s1 = letterCapitalize("thong ahihi neu  anh den   noi day");
       System.out.println(s1);
    }

}
