public class P17_Find_Missing_Num {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 4, 5 };
        // m1(arr);

        int[] arr = { 10, 11, 12, 14 };
        m2(arr);
    }

    public static void m1(int[] arr) {
        int sum1 = 0;
        for (int i : arr) {
            sum1 = sum1 + i;
        }
        System.out.println("Total sum of arr : " + sum1);

        int sum2 = 0;
        int start = arr[0];
        int end = arr[arr.length - 1];

        for (int i = start; i <= end; i++) {
            sum2 = sum2 + i; // here i -> start to end Eg:- 1 to 5
        }
        System.out.println("Range Sum of arr : " + sum2);

        int res = Math.abs(sum1 - sum2);
        System.out.println("Missing Num : " + res);
    }

    public static void m2(int[] arr) {
        int start = arr[0];
        int end = arr[arr.length - 1];
        int countOfEle = end - start + 1; // total numbers expected

        // actual sum of array(Total)
        int sum1 = 0;
        for (int i : arr) {
            sum1 += i;
        }
        System.out.println("Total sum : " + sum1);

        // expected sum of complete range
        int sum2 = (countOfEle * (start + end)) / 2; // (n*(start+end))/2
        System.out.println("sum of Range: " + sum2);

        int res = Math.abs(sum1 - sum2);
        System.out.println("res : " + res);
    }
}
