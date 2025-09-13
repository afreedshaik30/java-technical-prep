public class P20_Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 10, 30, 50, 20, 40 };
        int target = 20;

        int res = linearSearch(arr, target);

        if (res == -1) {
            System.out.println("Target " + target + " NOT FOUND");
        } else {
            System.out.println(target + " found at index : " + res);
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}