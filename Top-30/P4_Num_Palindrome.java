public class P4_Num_Palindrome {
    public static void main(String[] args) {
        int num = 560065;
        m1(num);
    }

    public static void m1(int num) {

        int og_num = num;
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if (og_num == rev) {
            System.out.println(og_num + " is a Palindrome.");
        } else {
            System.out.println(og_num + " is NOT a Palindrome.");
        }
    }
}
