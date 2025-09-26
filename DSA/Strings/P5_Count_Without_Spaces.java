public class P5_Count_Without_Spaces {
    public static void main(String[] args) {
        String str = "Hello World. This is Afreed"; // 23 + 4 spaces
        System.out.println(str.replaceAll("\\s", "").length()); // 23
        countWithoutSpaces(str);
    }

    static void countWithoutSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("count : " + count);
    }
}
