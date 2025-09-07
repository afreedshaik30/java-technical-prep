/*
        A A A A * 
        A A A * * *
        A A * * * * *
        A * * * * * * *
        * * * * * * * * *

        i -> 1 to <=num 
            j -> i to <num   
            j -> 1 to <=i
            j -> 2 to <=i
*/

public class Pat6_Pyramid_Hill {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = i; j < num; j++) { // dec(space) from i to <num
                System.out.print("A ");
            }
            for (int j = 1; j <= i; j++) { // inc(star) from 1 to <=i
                System.out.print("* ");
            }

            for (int j = 2; j <= i; j++) { // inc(star) from 2 to <=i
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
