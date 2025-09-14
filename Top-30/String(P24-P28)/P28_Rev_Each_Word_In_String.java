public class P28_Rev_Each_Word_In_String {
    public static void main(String[] args) {
        String str = "Welocme To Java 123";
        m1(str);
    }

    public static void m1(String str) {
        String words[] = str.split(" ");
        String revStr = "";
        for (String eachWord : words) {
            String revWord = "";
            for (int i = eachWord.length() - 1; i >= 0; i--) {
                revWord = revWord + eachWord.charAt(i);
            }
            revStr = revStr + revWord + " ";
        }
        System.out.println("Reversed Each Word: " + revStr.trim());
    }
}
