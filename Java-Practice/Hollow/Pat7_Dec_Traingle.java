package Hollow;

/*
    * * * * * 
    *     * 
    *   * 
    * * 
    * 
*/
public class Pat7_Dec_Traingle{
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                if (j == num || i == 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
