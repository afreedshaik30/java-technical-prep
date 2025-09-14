import java.util.Arrays;

public class P22_Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 2, 8 };

        System.out.println("Before Sorting : " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));

    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void bubbleSort(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len; i++) {

            boolean swapped = false;

            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

}
