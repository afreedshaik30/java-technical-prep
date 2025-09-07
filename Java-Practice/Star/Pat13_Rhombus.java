/*
    i to <num , 1 to <num

          * * * * * 
        * * * * *
      * * * * *
    * * * * *
  * * * * *

-------------------------

  1 to <=i , 1 to <num

  * * * * *
    * * * * *
      * * * * *
        * * * * *
          * * * * *
*/

public class Pat13_Rhombus {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("-------------------------");
        System.out.println();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
