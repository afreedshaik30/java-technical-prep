public class P3_Rev_String {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a num : ");
        // int num = sc.nextInt();

        String str = "ABCD";

        m1(str);
        m2(str);
        m3(str);
        m4(str);
        // sc.close();
    }

    public static void m1(String str) {

        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("m1 -> Rev : " + rev);
    }

    public static void m2(String str) {

        char[] chArr = str.toCharArray();
        String rev = "";
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + chArr[i];
        }

        System.out.println("m2 -> Rev : " + rev);
    }

    public static void m3(String str) {
        StringBuffer sb = new StringBuffer(str);
        System.out.println("m3 -> Rev : " + sb.reverse());
    }

    public static void m4(String str) {
        StringBuilder sbl = new StringBuilder(str);
        System.out.println("m4 -> Rev : " + sbl.reverse());
    }
}
