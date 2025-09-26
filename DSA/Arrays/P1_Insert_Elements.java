import java.util.Arrays;

public class P1_Insert_Elements {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30 };
        int value = 5;

        System.out.println("Original : " + Arrays.toString(arr));

        atStart(arr, value);
        atEnd(arr, value);

        System.out.println("---------------------------");
        atMiddle();
    }

    public static void atStart(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        newArr[0] = value;

        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("At START : " + Arrays.toString(newArr));
    }

    public static void atEnd(int[] arr, int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i]; // 10,20,30 (0,1,2)
        }
        newArr[arr.length] = value; // 5 (3)

        System.out.println("At END : " + Arrays.toString(newArr));
    }

    public static void atMiddle() {
        int[] arr = { 10, 20, 30, 40 }; // 0 to 3 ---> 4
        int index = 2;
        int value = 5;

        int[] newArr = new int[arr.length + 1]; // 5

        for (int i = 0; i < index; i++) { // 0,1
            newArr[i] = arr[i];
        }

        newArr[index] = value; // 2

        for (int i = index; i < arr.length; i++) { // 3, 4
            newArr[i + 1] = arr[i];
        }

        System.out.println("Original : " + Arrays.toString(arr));
        System.out.println("AT index " + index + " : " + Arrays.toString(newArr));
    }
}
