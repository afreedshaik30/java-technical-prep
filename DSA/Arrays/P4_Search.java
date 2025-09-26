public class P4_Search {
    public static void main(String[] args) {

        int[] arr = { 11, 10, 8, 5, 4, 6 };
        int res1 = linearSearch(arr, 8);

        if (res1 == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("Element Found At index : " + res1);
        }

        int[] sortedArr = { 10, 20, 30, 40, 50, 60 };
        int res2 = binarySearch(sortedArr, 60);

        if (res2 == -1) {
            System.out.println("NOT FOUND");
        } else {
            System.out.println("Element Found At index : " + res2);
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid])
                return mid;
            if (target > arr[mid])
                left = mid + 1;
            if (target < arr[mid])
                right = mid - 1;
        }
        return -1;
    }
}
