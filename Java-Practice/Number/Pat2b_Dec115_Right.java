package Number;

/*

1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5 

*/
public class Pat2b_Dec115_Right {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1, p = 1; i <= num; i++, p++) {
            for (int j = i; j <= num; j++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}
