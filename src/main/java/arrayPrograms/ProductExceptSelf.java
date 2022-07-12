package arrayPrograms;

import java.util.Arrays;

/*Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]*/
public class ProductExceptSelf {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        productExceptSelf(nums);
    }

    // Time Complexity: O(N)
// Space Complexity: O(1)
        public static int[] productExceptSelf(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];

            // Perform Prefix product operation by traversing Left -> Right
            int prefix = 1;
            for (int i = 0; i < nums.length; i++) {
                result[i] = prefix;
                prefix *= nums[i];
            }

            // Perform Postfix product operation by traversing Right -> Left
            int postfix = 1;
            for (int i = nums.length - 1; i >= 0; i--) {
                result[i] *= postfix;
                postfix *= nums[i];
            }
            System.out.println(Arrays.toString(result));
            return result;
        }

}
