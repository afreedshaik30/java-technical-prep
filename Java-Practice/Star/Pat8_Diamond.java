/*

    A A A A * 
    A A A * * * 
    A A * * * * * 
    A * * * * * * * 
    * * * * * * * * * 
    V * * * * * * * 
    V V * * * * * 
    V V V * * * 
    V V V V * 

    i -> 1 to <num
         j -> i to <num
         j -> 1 to <=i
         j -> 2 to <=i 
    
    i -> 1 to <=num
         j -> 1 to <i
         j -> i to <num
         j -> i to <=num     

*/

public class Pat8_Diamond {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i < num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print("A ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("V ");
            }
            for (int j = i; j < num; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
