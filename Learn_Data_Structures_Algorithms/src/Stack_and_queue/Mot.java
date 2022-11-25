package Stack_and_queue;

import java.util.Stack;

public class Mot {
      static String solution(String S) {
        Stack<Character> q = new Stack<Character>();
        for (int i = 0; i < S.length(); ++i)
        {
            if (S.charAt(i) != '#')
                q.push(S.charAt(i));
            else if (!q.isEmpty())
                q.pop();
        }

        // build final string
        String ans = "";
        while (!q.isEmpty()) {
            ans += q.pop();
        }

        // return final string
        String answer = "";
        for(int j = ans.length() - 1; j >= 0; j--) {
            answer += ans.charAt(j);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "aa#b#c";
        System.out.println(solution(s));
    }

}

//Assume '#' is like a backspace in string. This means that string 'a#bc#d' actually is 'bd'
//
//        Your task is to process a string with '#' symbols.
//
//        Examples
//        "acb#e##c" ==> "ac"
//        "adfc##d######" ==> ""
//        "#######" ==> ""
//        "" ==> ""

// link : https://app.codesignal.com/challenge/2K8MQCqoeMgoLnk6u