package test;

import java.util.Arrays;

public class check_xem_phai_dao_chu_khong {
    // string -> tạo từ char
    // return true, false -> boolean

    private static char[] string1, string2;

    public static boolean isInversion(String s1, String s2) {
        string1 = s1.replaceAll(" ", "").toLowerCase().toCharArray(); // convert chuỗi -> in thường -> mảng char
        string2 = s2.replaceAll(" ", "").toLowerCase().toCharArray();

        Arrays.sort(string1); //  Arrays.sort() để sắp xếp các ký tự trong mảng ký tự
        Arrays.sort(string2);

        return Arrays.equals(string1, string2);
    }


    public static void main(String[] args) {
        System.out.println(isInversion("thong b e m", " me b gn o ht"));
    }

}
