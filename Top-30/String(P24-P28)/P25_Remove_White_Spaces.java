public class P25_Remove_White_Spaces {
    public static void main(String[] args) {
        String str = " Java  is  a programming language ";
        str = str.replaceAll("\\s", "");
        System.out.println(str);
    }
}
