public class P8_Sum_Of_Digits_In_A_Num {
    public static void main(String[] args) {
        int num = 12345;
        m1(num);
    }

    public static void m1(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("SUM : " + sum);
    }
}
