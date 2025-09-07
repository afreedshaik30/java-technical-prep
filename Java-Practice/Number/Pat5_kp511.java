package Number;

/*

54321
 4321
  321
   21
    1
    
*/
public class Pat5_kp511 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1, k = num; i <= num; i++, k--) {
            int p = k;
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= num; j++) {
                System.out.print(p--);
            }
            System.out.println();
        }
    }
}
