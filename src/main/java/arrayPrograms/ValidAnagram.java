package arrayPrograms;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        isAnagram(s, t);
    }

    public static boolean isAnagram(String s, String t) {
      /* //Time Complexity = O(nlogn)
        if (s.length() != t.length())
            return false;

        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1);
        System.out.println(arr2);
        return Arrays.equals(arr1, arr2);*/

        //Time Complexity = O(n)
        if (s.length() != t.length())
            return false;

        //count all char from a to z
        int[] countArr = new int[26];
        for (int i = 0; i < s.length(); i++) {

            //Incrementing character count of s  //ASCII code of a=97, b = 98 ... z = 122
            countArr[s.charAt(i) - 'a']++;      //  a-a=0 -> n-a=

            //decrementing character count of t
            countArr[t.charAt(i) - 'a']--;
        }
        for (int j = 0; j < countArr.length; j++) {

            if (countArr[j] != 0)
                return false;
        }
        System.out.println(s);
        System.out.println(t);
        return true;
    }

}
