package test;

public class test02 {

    public static void main(String[] args) {
        System.out.println(stringChallege("47")); // output : 244
    }
    private static String stringChallege(String str) {
        String binary = Integer.toBinaryString(Integer.parseInt(str));
        String binaryConvert = String.format("%8s", binary).replace(" ", "0");
        String buider = new StringBuilder(binaryConvert).reverse().toString();
        int number = Integer.parseInt(buider, 2); // convert chuỗi nhị phân -> số thập phân
        return String.valueOf(number);
    }
}
