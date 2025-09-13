public class P18_Max_Min_Element {
    public static void main(String[] args) {
        int[] arr = { 1, 9, 8, 2, 7, 3 };
        m1(arr);
    }

    public static void m1(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);
    }
}
