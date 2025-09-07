package Number;

/* 

5
54
543
5432
54321

*/
public class Pat7b_Inc551 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            int p = 5;
            for (int j = 1; j <= i; j++) {
                System.out.print(p--);
            }
            System.out.println();
        }
    }
}
