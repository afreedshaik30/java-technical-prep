public class P1_Rev_String {
    public static void main(String[] args) {
        String str = "Welcome 123";
        revString(str);
    }

    static void revString(String str) {
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr = revStr + str.charAt(i);
        }

        System.out.println("Og : " + str);
        System.out.println("Rev : " + revStr);
    }
}