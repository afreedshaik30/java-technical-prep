package Number;

/*

 12345
  1234
   123
    12
     1

*/
public class pat6_Mjr151Diagonal {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            int p = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= num; j++) {
                System.out.print(p++);
            }
            System.out.println();
        }
    }
}
