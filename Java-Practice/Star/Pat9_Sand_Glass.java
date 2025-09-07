/*
   * * * * * * * * * 
    * * * * * * *
      * * * * *
        * * *
          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *

  i -> 1 to <num
       j -> 1   to <=i
       j -> i   to <=num
       j -> i+1 to <=num

  i -> 2 to <=num
       j -> i  to <=num
       j -> 1  to <=i
       j -> 2  to <=i      
*/

public class Pat9_Sand_Glass {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= num; j++) {
                System.out.print("* ");
            }
            for (int j = i + 1; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 2; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
