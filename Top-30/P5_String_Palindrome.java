public class P5_String_Palindrome {
    public static void main(String[] args) {
        String str = "ABCDCBA";
        m1(str);
    }

    public static void m1(String str) {
        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println(str + " is a Palindrome String");
        } else {
            System.out.println(str + " is NOT a Palindrome String");
        }
    }
}
