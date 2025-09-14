import java.util.Arrays;

public class P23_Built_In_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8 };

        System.out.println("Before Sorting : " + Arrays.toString(arr));
        m1(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));

        System.out.println();

        System.out.println("Before Sorting : " + Arrays.toString(arr));
        m2(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }

    public static void m1(int[] arr) {
        Arrays.sort(arr);
    }

    public static void m2(int[] arr) {
        Arrays.parallelSort(arr);
    }
}
