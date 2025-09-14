import java.util.Scanner;
import java.util.StringTokenizer;

public class P27_Count_Words_In_String {
    public static void main(String[] args) {
        String str = "Hello World This is Java  8"; // 6
        m1(str);
        m2(str);
        m3(str);
    }

    private static void m1(String str) {
        if (str != null && !str.isEmpty()) {
            Scanner sc = new Scanner(str);
            int count = 0;
            while (sc.hasNext()) {
                sc.next();
                count++;
            }
            sc.close();
            System.out.println("Words : " + count);
        }

    }

    private static void m2(String str) {
        if (str != null && !str.isEmpty()) {
            StringTokenizer st = new StringTokenizer(str);
            System.out.println("count of tokens/words : " + st.countTokens());
        }
    }

    private static void m3(String str) {
        if (str != null && !str.trim().isEmpty()) {
            String words[] = str.trim().split("\\s+");
            System.out.println("count : " + words.length);
        }
    }
}
