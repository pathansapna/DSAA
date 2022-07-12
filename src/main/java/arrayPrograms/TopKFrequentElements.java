package arrayPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]*/
public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,5};
        int k = 0;
        topKFrequent(nums, k);
    }

    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
//            System.out.println(i + "="+ map.getOrDefault(i, 0)+1);
//            System.out.println(i);

//            System.out.println( map.put(i, map.getOrDefault(i, 0) + 1));
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());


        for (Map.Entry entry : map.entrySet()){
            pq.add(entry);
//            System.out.println("Know the how many entries of that integer "+ map.entrySet());
//            System.out.println(entry);

        }
        int[] output = new int[k];
        for (int i = 0; i < k; i++){
            output[i] = pq.poll().getKey();

        }

        return output;
    }

}
