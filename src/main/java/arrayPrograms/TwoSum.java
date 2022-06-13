package arrayPrograms;

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
