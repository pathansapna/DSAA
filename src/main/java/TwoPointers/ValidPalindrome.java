package TwoPointers;
/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.*/
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        isPalindrome(s);
    }

    public static boolean isPalindrome(String s) {
        String fixed_string = "";
        for (char c : s.toCharArray()){
            if (Character.isDigit(c) || Character.isLetter(c)){
                fixed_string += c;
            }
        }
        fixed_string = fixed_string.toLowerCase();
        int start = 0;
        int end = fixed_string.length() - 1;
        while (start <= end){
            if (fixed_string.charAt(start) != fixed_string.charAt(end)){
                return false;
            }
            start += 1;
            end --;
        }

        System.out.println(fixed_string);
        return true;
    }
}
