package Hollow;

public class Pat11_Z_pattren {
    public static void main(String[] args) {
        int num = 7;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i + j == num + 1 || i == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
