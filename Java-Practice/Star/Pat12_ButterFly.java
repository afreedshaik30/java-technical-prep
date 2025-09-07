/*
  i -> 1     to <=num
       j -> 1 to <=i
       j -> 1 to <=2*(num-i)
       j -> 1 to <=i

  i -> num-1 to >=1
       j -> 1 to <=i
       j -> 1 to <=2*(num-i)
       j -> 1 to <=i
*/  

public class Pat12_ButterFly {
    public static void main(String[] args) {
        int num = 7;

        // upper
        for (int i = 1; i <= num; i++) {
            // Left
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Middle
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print("  ");
            }
            // Right
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower
        for (int i = num-1; i >= 1; i--) {
            // Left
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Middle
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print("  ");
            }
            // Right
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
