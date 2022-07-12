package arrayPrograms;

/*Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.



Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].*/
public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        int target = 9;
        sum(a, target);
    }

    private static void sum(int[] a, int target) {
        for(int i = 0; i <= a.length; i++){
            for (int j = i+1; j <a.length; j++){
                if( a[i] + a[j] == target) {
//                   return [i, j];
                }
            }


        }

    }
}
