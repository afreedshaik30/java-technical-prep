package Number;

/*

5 5 5 5 5 
4 4 4 4 
3 3 3 
2 2 
1 

*/
public class Pat1b_Dec551_Right {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1, p = 5; i <= num; i++, p--) {
            for (int j = i; j <= num; j++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}
