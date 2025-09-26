public class P2_Traverse_Elements {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println("Using for loop with index : ");
        forLoop(arr);

        System.out.println();

        System.out.println("Using forEach loop with element values : ");
        enhancedForLoop(arr);
    }

    public static void forLoop(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("At index " + i + " : " + arr[i]);
        }
    }

    public static void enhancedForLoop(int[] arr) {
        for (int ele : arr) {
            System.out.println("Values : " + ele);
        }
    }
}
