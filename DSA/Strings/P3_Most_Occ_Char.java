public class P3_Most_Occ_Char {
    public static void main(String[] args) {
        String str = "banana";
        char target = 'a';

        mostOccChar(str, target);
    }

    static void mostOccChar(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                count++;
            }
        }

        System.out.println("Target " + target + " is occur's " + count + " times");
    }
}
