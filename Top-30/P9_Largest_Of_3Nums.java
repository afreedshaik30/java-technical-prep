public class P9_Largest_Of_3Nums {
    public static void main(String[] args) {
        m1(50, 40, 30);
    }

    public static void m1(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("a is largest num");
        } else if (b > a && b > c) {
            System.out.println("b is largest num");
        } else {
            System.out.println("c is largest num");
        }
    }

    public static void m2(int a, int b, int c) {
        int twoNums = a > b ? a : b;
        int threeNums = c > twoNums ? c : twoNums;
        System.out.println(threeNums + " is the Largest Num");
    }
}
