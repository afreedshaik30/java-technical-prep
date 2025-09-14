public class P26_Count_Occ_Of_Char {
    public static void main(String[] args) {
        String str = "Hello World  ";
        char target = 'o';

        int countOcc = m1(str, target);
        System.out.println(target + " occ " + countOcc + " times.");
    }

    private static int m1(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
