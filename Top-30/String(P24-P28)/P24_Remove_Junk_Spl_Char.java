public class P24_Remove_Junk_Spl_Char {
    public static void main(String[] args) {
        String str = "!@#$%^&*() latin string 1234567890";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
    }
}