/*
        * * * * * * * * * 
        A * * * * * * *
        A A * * * * *
        A A A * * *
        A A A A *

        i -> 1 to <=num 
             j -> 1   to <i  
             j -> i   to <=num
             j -> i+1 to <=num
*/
public class Pat7_Inverse_Pyramid_Hill {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) { // inc(space)
                System.out.print("A ");
            }
            for (int j = i; j <= num; j++) { // dec(star)
                System.out.print("* ");
            }
            for (int j = i + 1; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
