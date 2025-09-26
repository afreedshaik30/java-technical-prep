import java.util.Arrays;

public class P3_Delet_Element_With_Index {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println("Original Array : " + Arrays.toString(arr));

        deletion(arr, 0); // start
        deletion(arr, arr.length - 1); // end
        deletion(arr, 2); // middle
    }

    public static void deletion(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if(i == index) continue;
            newArr[j++] = arr[i];
        }

        System.out.println("New Array : " + Arrays.toString(newArr));
    }
}
