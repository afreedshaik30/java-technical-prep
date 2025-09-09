import java.util.Random;

public class P12_Random_Num {
    public static void main(String[] args) {
        m1();
    }

    // 1. Random
    public static void m1() {
        Random rand = new Random();

        // --- Integers --- range(-2,147,483,648 to 2,147,483,647)
        int anyInt = rand.nextInt(); // returns a random int from 0 (inclusive) to bound (exclusive).
        int zeroToNine = rand.nextInt(10); // 0 to 9
        int oneToFifty = rand.nextInt(50) + 1; // 1 to 50

        // --- Doubles --- generates a random double between 0.0 (inclusive) and 1.0
        // (exclusive).
        double zeroToOne = rand.nextDouble(); // 0.0 <= x < 1.0
        double zeroToTen = rand.nextDouble() * 10; // 0.0 <= x < 10.0
        double fiveToTwenty = 5 + rand.nextDouble() * 15; // 5.0 <= x < 20.0

        // --- Printing results ---
        System.out.println("Random int (any range): " + anyInt);
        System.out.println("Random int (0–9): " + zeroToNine);
        System.out.println("Random int (1–50): " + oneToFifty);

        System.out.println("Random double (0.0–1.0): " + zeroToOne);
        System.out.println("Random double (0.0–10.0): " + zeroToTen);
        System.out.println("Random double (5.0–20.0): " + fiveToTwenty);
    }

    // 2. Math.random() -- returns a double between 0.0 (inclusive) and 1.0
    // (exclusive).
    public static void m2() {
        double randDouble = Math.random(); // 0.0–1.0
        int randInt0to9 = (int) (Math.random() * 10); // 0–9
        int randInt1to50 = (int) (Math.random() * 50) + 1; // 1–50
        double randDouble5to20 = 5 + Math.random() * 15; // 5.0–20.0

        System.out.println("Random double (0.0–1.0): " + randDouble);
        System.out.println("Random int (0–9): " + randInt0to9);
        System.out.println("Random int (1–50): " + randInt1to50);
        System.out.println("Random double (5.0–20.0): " + randDouble5to20); 
    }

    // 3. Apache common lang - API
}
