package Number;

/*

    1 
    2 3 
    4 5 6 
    7 8 9 10 

*/
public class Pat8_Floyd_Triangle {
    public static void main(String[] args) {
        int num = 4, p = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
    }
}