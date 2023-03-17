package array_mang;

import java.util.HashMap;
import java.util.Map;

public class test {
    // đếm sự xuất hiện của 1 từ
    // ví dụ : hello word -> h: 1 / e : 1 ...
    public static void characterCount(String string) {
        char[] toChar = string.toCharArray(); // helo -> 1 3 2 1 gì đó
        Map<Character, Integer> map = new HashMap<>();
        for (Character character : toChar) {
            if (map.containsKey(character)) { // có char đó rồi
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        String test = "hello word";
        characterCount(test);
    }
}
