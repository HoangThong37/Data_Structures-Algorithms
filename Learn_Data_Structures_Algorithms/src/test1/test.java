package test1;

public class test {

    public static void main(String[] args) {
        // đảo chuỗi mảng char
        String str = "hello bem";

        byte[] byteStr = str.getBytes(); //
        byte[] newByte = new byte[str.length()];

        for (int i = 0; i < byteStr.length; i++) {
            newByte[i] = byteStr[byteStr.length - 1 - i];
        }

        System.out.println(new String(newByte));
    }


}
