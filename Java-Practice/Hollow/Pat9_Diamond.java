package Hollow;
/*

   i -> 1 to <num
        j -> i to <num
        j -> 1 to <=i
        j -> 2 to <=i 

           * 
  j=1    *   *   j=i
       *       *
     *           *
   *               *
     *           *
  j=i  *       * j=n
         *   *
           *
           * 
    i -> 1 to <= num   
         j -> 1 to <i
         j -> i to <num
         j -> i to <=num    
*/

public class Pat9_Diamond {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i < num; i++) { // 1 to 4
            for (int j = i; j < num; j++) { // i to 4
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) { // 1 to <=i
                if (j == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = 2; j <= i; j++) { // 2 to <=i
                if (j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= num; i++) { // 1 to 5
            for (int j = 1; j < i; j++) { // 1 to i-1
                System.out.print("  ");
            }
            for (int j = i; j < num; j++) { // i to 4
                if (j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int j = i; j <= num; j++) { // i to 5
                if (j == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
