public class P6_Count_Of_Digits_In_A_Num {
    public static void main(String[] args) {
        long num = 9014782986l;

        m1(num);
    }

    public static void m1(long num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        System.out.println("COUNT : " + count);
    }
}
