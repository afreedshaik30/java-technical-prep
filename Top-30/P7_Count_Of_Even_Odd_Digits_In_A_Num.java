public class P7_Count_Of_Even_Odd_Digits_In_A_Num {
    public static void main(String[] args) {
        int num = 123456789;
        m1(num);
    }

    private static void m1(int num) {
        int even_count = 0, odd_count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }

            num = num / 10;
        }

        System.out.println("even : " + even_count);
        System.out.println("odd : " + odd_count);
    }
}
