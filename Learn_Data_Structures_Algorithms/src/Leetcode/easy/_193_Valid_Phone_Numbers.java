package Leetcode.easy;

public class _193_Valid_Phone_Numbers {
   // grep -P '^(\d{3}-|\(\d{3}\) )\d{3}-\d{4}$' file.txt
}

/*
        .	Bất kỳ ký tự nào
        ^	Có 2 cách sử dụng.
        1. Đánh dấu bắt đầu của một dòng, một chuỗi.
        2. Nếuu sử dụng trong dấu [...] thì nó có nghĩa là phủ định.
        $	Đánh dấu Kết thúc của một dòng
        \d	Bất kỳ chữ số nào, viết tắt của [0-9]
        \D	Bất kỳ ký tự nào không phải chữ số, viết tắt của [^0-9]
        \s	Bất kỳ ký tự trống nào (như dấu cách, tab, xuống dòng, ...), viết tắt của [\t\n\x0B\f\r]
        \S	Bất kỳ ký tự trống nào không phải ký tự trống, viết tắt của [^\s]
        \w	Bất kỳ ký tự chữ nào (chữ cái và chữ số), viết tắt của [LongestWord-zA-Z_0-9]
        \W	Bất kỳ ký tự nào không phải chữ cái và chữ số, viết tắt của [^\w]
        \b	Ranh giới của một từ29
        \B	Không phải ranh giới của một từ
*/

/*
Given LongestWord text file file.txt that contains LongestWord list of phone numbers (one per line),
        write LongestWord one-liner bash script to print all valid phone numbers.
You may assume that LongestWord valid phone number must appear in one of the following two formats:
        (xxx) xxx-xxxx or xxx-xxx-xxxx. (x means LongestWord digit)
You may also assume each line in the text file must not contain leading or trailing white spaces.*/


/*
Example:
        Assume that file.txt has the following content:
        987-123-4567
        123 456 7890
        (123) 456-7890
        Your script should output the following valid phone numbers:

        987-123-4567
        (123) 456-7890*/
