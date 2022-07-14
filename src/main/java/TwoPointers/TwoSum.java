package TwoPointers;

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

    private static int[] sum(int[] a, int target) {
       int start_pointer = 0;
       int end_pointer = a.length - 1;

       while(start_pointer <= end_pointer){
           int sum = a[start_pointer] + a[end_pointer];

           if (sum > target){
               end_pointer -= 1;

           }else if (sum < target){
               start_pointer += 1;
           }else {
               return new int[] {start_pointer + 1, end_pointer + 1};
           }
       }

        return new int[] {start_pointer + 1, end_pointer + 1};
    }
}
