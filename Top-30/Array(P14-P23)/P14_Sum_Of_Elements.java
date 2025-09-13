public class P14_Sum_Of_Elements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        m1(arr);
    }

    public static void m1(int[] arr) {
        int sum = 0;
        // for (int i : arr) {
        // sum = sum + i;
        // }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum  : " + sum);
    }
}
