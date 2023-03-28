package test;

public class testGame {
    // chia 2 mảng
    // revert từng mảng

    static String  solution(String x) {
        StringBuilder rs = new StringBuilder();
        int n = x.length();
        if (n % 2 == 0) {
            String chuoi1 = x.substring(0, x.length()/2);
            String chuoi2 = x.substring(n/2, n);
            // String[] words = x.split("");
            StringBuilder rv1 = new StringBuilder(chuoi1);
            StringBuilder rv2 = new StringBuilder(chuoi2);
            return rs.append(rv1.reverse()).append(rv2.reverse()).toString();
        } else {
            String chuoi3 = x.substring(0, n/2);
            String chuoi5 = x.substring(n/2 + 1, n);
            StringBuilder rv1 = new StringBuilder(chuoi3);
            rv1.reverse();
            StringBuilder rv2 = new StringBuilder(chuoi5);
            rv2.reverse();
            String s = String.valueOf(x.charAt(n/2));
            return rs.append(rv1).append(s).append(rv2).toString();
        }
    }

    public static void main(String[] args) {
        String n ="tasxi";
        System.out.println(solution(n));
    }

}
//    Bạn được cung cấp một chuỗi các từ (x),
//    đối với mỗi từ trong chuỗi, bạn cần lật từ 'từ trong ra ngoài'.
//        Điều này có nghĩa là các chữ cái bên trong sẽ di chuyển ra ngoài và các
//        chữ cái bên ngoài sẽ di chuyển về phía trung tâm.
//
//        Nếu từ có độ dài chẵn, tất cả các chữ cái sẽ di chuyển.
//        Nếu độ dài là số lẻ, bạn phải để lại chữ cái 'ở giữa' của từ đó.



//    You are given a string of words (x), for each word within the string you need to
//        turn the word 'inside out'. By this I mean the internal letters will move out,
//        and the external letters move toward the centre.
//
//        If the word is even length, all letters will move.
//        If the length is odd, you are expected to leave the 'middle'
//        letter of the word where it is.
//
//        An example should clarify:
//
//        'taxi' would become 'atix' 'taxis' would become 'atxsi'