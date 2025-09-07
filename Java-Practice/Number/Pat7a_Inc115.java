package Number;

/*

1
12
123
1234
12345

*/
public class Pat7a_Inc115 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            int p = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(p++);
            }
            System.out.println();
        }
    }
}
