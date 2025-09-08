// import java.util.Scanner;

public class P2_Rev_Num {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a num : ");
        // int num = sc.nextInt();

        int num = 1234;
        m1(num);
        m2(num);
        m3(num);
        // sc.close();
    }

    public static void m1(int num) {

        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("m1 -> Rev : " + rev);
    }

    public static void m2(int num) {
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        System.out.println("m2 -> Rev : " + sb.reverse());
    }

    public static void m3(int num) {
        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        System.out.println("m3 -> Rev : " + sbl.reverse());
    }
}
