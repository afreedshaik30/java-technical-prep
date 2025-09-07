package Number;

/*
        1 
      1 2 3 
    1 2 3 4 5 
  1 2 3 4 5 6 7 
1 2 3 4 5 6 7 8 9

*/

public class Pat9_Pyramid_P2 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            int p = 1;
            for (int j = i; j < num; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(p++ + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
    }
}
