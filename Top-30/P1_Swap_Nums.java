public class P1_Swap_Nums {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("Before : a = " + a + " b = " + b);
        m1(a, b);
        m2(a, b);
        m3(a, b);
        m4(a, b);
        m5(a, b);
    }

    public static void m1(int a, int b) {

        int temp = a;
        a = b;
        b = temp;

        System.out.println("m1 --> After : a = " + a + " b = " + b);
    }

    public static void m2(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("m2 --> After : a = " + a + " b = " + b);
    }

    public static void m3(int a, int b) {

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("m3 --> After : a = " + a + " b = " + b);
    }

    public static void m4(int a, int b) {

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("m4 --> After : a = " + a + " b = " + b);
    }

    public static void m5(int a, int b) {

        b = a + b - (a = b);
        System.out.println("m5 --> After : a = " + a + " b = " + b);
    }
}