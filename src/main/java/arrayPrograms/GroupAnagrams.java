package arrayPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
YouTube Channel
https://www.youtube.com/watch?v=8u8JlpYAoPg
*/

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};

        groupAnagrams(s);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        //Check for empty inputs
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
//            System.out.println(str);
            String key = getKey(str);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
//            System.out.println(list);
            list.add(str);

            map.put(key, list);
//            System.out.println(map.put(key, list));
        }
        return new ArrayList<>(map.values());
    }

    private static String getKey(String str) {

        char[] keyChar = new char[26];
        for(char c : str.toCharArray()){

            keyChar[c - 'a']++;
        }
//        System.out.println(new String(keyChar));
        return new String(keyChar);
    }
}