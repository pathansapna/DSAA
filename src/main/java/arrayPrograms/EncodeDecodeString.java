package arrayPrograms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class EncodeDecodeString {
    public static final char DELIMITER = '#';
    

    public static void main(String[] args) {
        String str = "";
        List<String> strs = Arrays.asList(new String[]{"lint", "code", "love", "you"});
        encode(strs);
        decode(str);
    }



    /*
         * @param strs: a list of strings
         * @return: encodes a list of strings to a single string.
         */

        public static String encode(List<String> strs) {
            StringBuilder sb = new StringBuilder();
            for(String str : strs){
                sb.append(str.length());
                sb.append(DELIMITER);
                sb.append(str);
            }
            System.out.println(sb.toString());
            return sb.toString();

        }

        /*
         * @param str: A string
         * @return: dcodes a single string to a list of strings
         */
        public static List<String> decode(String str) {
            List<String> list = new LinkedList<>();
            char[] arr = str.toCharArray();
            for(int i = 0; i < arr.length; i++){
                StringBuilder sb = new StringBuilder();
                while(arr[i] != DELIMITER) {
                    sb.append(arr[i++]);
                }
                i++;
                int numOfChars = Integer.valueOf(sb.toString());
                int end = i + numOfChars;
                sb = new StringBuilder();
                while(i < end){
                    sb.append(arr[i++]);
                }
                i--;
                list.add(sb.toString());
                System.out.println(list.add(sb.toString()));

            }
            return list;


        }

    }


