public class P6_StringBuilder_Rev_Words {
    public static void main(String[] args) {
        String str = "I Love Java";
        System.out.println("Original String : " + str);
        revWords(str);
    }

    static void revWords(String str) {
        String[] words = str.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0)
                sb.append(" ");
        }
        System.out.println("Revered String : " + sb.toString());
    }
}
