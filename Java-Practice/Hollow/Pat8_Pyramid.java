package Hollow;

/* 
          * 
  j=1   *   *    j=i
      *       *
    *           *
  * * * * * * * * *
    i=num   i=num
*/
public class Pat8_Pyramid{
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 2; j <= i; j++) {
                if (j == i || i == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
