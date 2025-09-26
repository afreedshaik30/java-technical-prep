public class P2_String_Palindrome {
    public static void main(String[] args) {
        String str = "madam";

        if (checkPalindrome(str)) {
            System.out.println("IS a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    static boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
