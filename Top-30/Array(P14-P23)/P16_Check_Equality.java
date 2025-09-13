import java.util.Arrays;

public class P16_Check_Equality {
    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5 };
        int[] a2 = { 1, 2, 31, 4, 5 };

        // m1(a1, a2);
        m2(a1, a2);
    }

    public static void m1(int[] a1, int[] a2) {
        boolean status = Arrays.equals(a1, a2);
        if (status) {
            System.out.println("Both are EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }

    public static void m2(int[] a1, int[] a2) {
        boolean flag = true;
        if (a1.length == a2.length) {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    flag = false;
                }
            }
        }
        if (flag) {
            System.out.println("Both Array's are EQUAL");
        } else {
            System.out.println("NOT EQUAL");
        }
    }
}
