public class P10_Fibonacci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34
        int n1 = 0, n2 = 1, sum = 0;
        System.out.print(n1 + " " + n2);
        m1(n1, n2, sum);
    }

    public static void m1(int n1, int n2, int sum) {
        for (int i = 2; i < 10; i++) {
            sum = n1 + n2;
            System.out.print(" " + sum);
            n1 = n2;
            n2 = sum;
        }
    }
}
