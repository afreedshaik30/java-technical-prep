package Number;

/*

1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5

*/

public class Pat1a_Inc155_Left {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1, p = 1; i <= num; i++, p++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(p + " ");
            }
            System.out.println();
        }

    }
}
