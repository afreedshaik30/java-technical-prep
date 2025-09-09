public class P11A_Prime_Num_In_Range {
    public static void main(String[] args) {
        int start = 1, end = 50;
        primeInRange(start, end);
    }

    public static void primeInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num == 2)
            return true;
        if (num <= 1)
            return false;
        if (num % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}