public class BitwiseOperatorOddEvenNumber {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5};
        oddEven(a);

    }

    private static void oddEven(int[] a) {
        for (int i = 0; i <= 3; i++) {
            if (a[i] % 2 == 0)
                System.out.println(a[i] + " Number is even");
            else
                System.out.println(a[i] + " Number is odd");
        }
    }
}
