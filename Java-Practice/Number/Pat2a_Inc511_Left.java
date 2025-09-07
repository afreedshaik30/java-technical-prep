package Number;

/*

5 
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1

*/
public class Pat2a_Inc511_Left {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1, p = 5; i <= num; i++, p--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}