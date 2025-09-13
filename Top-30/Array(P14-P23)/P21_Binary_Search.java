import java.util.Arrays;

public class P21_Binary_Search {
    public static void main(String[] args) {
        int[] arr = { 10, 30, 50, 20, 40 };
        int target = 20;

        // Binary search requires sorted array
        Arrays.sort(arr); // arr --> {10, 20, 30, 40, 50}

        int res = binarySearch(arr, target);

        if (res == -1) {
            System.out.println("Target " + target + " NOT FOUND");
        } else {
            System.out.println(target + " found at index : " + res);
        }
    }

    public static int binarySearch(int[] arr, int target) {

        // {10, 20, 30, 40, 50}

        int left = 0;
        int right = arr.length - 1;
        int mid = left + (right - left) / 2;

        while (left <= right) {
            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                return mid + 1;
            }
            if (target < arr[mid]) {
                return mid - 1;
            }
        }
        return -1;
    }
}
