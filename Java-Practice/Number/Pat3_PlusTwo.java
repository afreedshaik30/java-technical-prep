package Number;
/*

0 
2 2
4 4 4
6 6 6 6
8 8 8 8 8

*/

public class Pat3_PlusTwo {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1, p = 0; i <= num; i++, p += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}
