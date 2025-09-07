package Hollow;
/*

    _ _ _ _ * 
    _ _ _ * _ 
    _ _ * _ _ 
    _ * _ _ _ 
    * _ _ _ _ 

*/

public class Pat3_Left_Diagonal {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i + j == num + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
