/*
    1. Natural Num > 1
    2. Which has only 2 factors 1 and itself

    eg : 2,3,5,7,11,13,17....

    19 -> 1,19          -> Prime
    28 -> 1,2,4,7,14,28 -> NOT Prime
*/
public class P11_Prime_Num {
    public static void main(String[] args) {
        int num = 28;
        // m1(num);

        if (m2(num)) {
            System.out.println(num + " is a PRIME");
        } else {
            System.out.println(num + " is NOT PRIME");
        }
    }

    // O(n)
    public static void m1(int num) {
        int count = 0;
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
        }
        if (count == 2) {
            System.out.println(num + " is a Prime Num");
        } else {
            System.out.println(num + " is NOT a Prime Num");
        }
    }

    // O(√n)
    public static boolean m2(int num) {
        if (num <= 1) // -ve,0,1 are NOT Prime
            return false;
        if (num % 2 == 0) // (even num > 2) are NOT Prime
            return false;
        if (num == 2) // 2 is a Prime
            return true;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

        /*
         * Skip even numbers (except 2).
         * Check only odd divisors up to √num.
         * If no divisors are found → the number is prime.
         */
    }
}
