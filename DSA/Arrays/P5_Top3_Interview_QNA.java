import java.util.Arrays;

public class P5_Top3_Interview_QNA {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        // Q1
        maxElement(arr);

        // Q2
        reverseArrayElements(arr);

        // Q3
        even_Odd_Counts(arr);

    }

    static void maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Max Element : " + max);
    }

    static void reverseArrayElements(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++; // --->
            end--; // <--
        }

        System.out.println("Rev Arr : " + Arrays.toString(arr));
    }

    static void even_Odd_Counts(int[] arr) {
        int even_count = 0, odd_count = 0;
        for (int ele : arr) {
            if (ele % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
        }
        System.out.println("Even : " + even_count);
        System.out.println("Odd : " + odd_count);
    }
}
