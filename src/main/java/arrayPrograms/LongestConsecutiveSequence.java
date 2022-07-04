package arrayPrograms;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        longestConsecutive(nums);
    }

    private static int longestConsecutive(int[] nums) {
        HashSet<Integer> num_set = new HashSet<>();
        for (int num : nums){
            num_set.add(num);
        }

        int max_sequence_length = 0;
        for (int i = 0; i < nums.length; i++){
            int current_num = nums[i];
            int current_seq_length = 1;

            if (!num_set.contains(current_num - 1)){
                while (num_set.contains(current_num + 1)){
                    current_num += 1;
                    current_seq_length += 1;
                }
                max_sequence_length = Math.max(max_sequence_length, current_seq_length);
            }
        }
        System.out.println(max_sequence_length);
        return max_sequence_length;
    }
}
