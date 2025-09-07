package Hollow;

public class Pat10_Sand_Glass {
    public static void main(String[] args) {
        int num = 7;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i + j == num + 1 || i == j || i == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
