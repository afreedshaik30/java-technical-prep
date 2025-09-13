import java.util.HashSet;

public class P19_Find_Duplicates {
    public static void main(String[] args) {
        String[] langs = { "java", "python", "javascript", "c++", "java" };

        // m1(langs);

        System.out.println("using hashset  --> ");
        m2(langs);
    }

    public static void m1(String[] langs) {
        boolean flag = false;

        for (int i = 0; i < langs.length; i++) {
            for (int j = i + 1; j < langs.length; j++) {

                if (langs[i] == langs[j]) {
                    System.out.println("Found Dupllicate : " + langs[i]);
                    flag = true;
                }
            }
        }

        if (!flag) {
            System.out.println("Duplicates NOT FOUND");
        }
    }

    public static void m2(String[] langs) {
        boolean flag = false;
        HashSet<String> set = new HashSet<>();

        for (String ele : langs) {
            if (!set.add(ele)) {
                System.out.println("Duplicate FOUND : " + ele);
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Duplicates NOT FOUND");
        }
    }
}