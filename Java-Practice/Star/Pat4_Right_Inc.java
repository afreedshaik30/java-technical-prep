/* 
    Right - aligned Triangle --- dec(space) + inc(star)
    space - i to <=num
        A A A A A * 
        A A A A * *
        A A A * * *
        A A * * * *
        A * * * * *

    space - i to <num  
        A A A A * 
        A A A * *
        A A * * *
        A * * * *
        * * * * *
*/

public class Pat4_Right_Inc {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int space = i; space < num; space++) {
                System.out.print("A ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
