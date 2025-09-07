package Number;

/*

1 
2 2 
1 1 1 
2 2 2 2 
1 1 1 1 1 

*/
public class Pat4_Even_Odd {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) { // odd
                    System.out.print("1 ");
                } else { // even
                    System.out.print("2 ");
                }
            }
            System.out.println();
        }
    }
}
