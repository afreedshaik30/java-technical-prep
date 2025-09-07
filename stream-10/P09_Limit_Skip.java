import java.util.Arrays;
import java.util.List;

public class P09_Limit_Skip {
    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(1, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 30, 19, 3);

        // LIMIT()
        // i)get first 5 num and ii) sum of them(5 nums)
        List<Integer> first5 = arrList.stream().limit(5).toList(); // [1, 3, 10, 20, 30]

        int sum1 = first5.stream().reduce((a, b) -> a + b).get();

        System.out.println("FIRST-5 : " + first5);
        System.out.println("SUM : " + sum1); // 64

        // SKIP()
        List<Integer> from6 = arrList.stream().skip(5).toList(); // [15, 1, 13, 1, 2, 2, 10, 30, 19, 3]

        int sum2 = from6.stream().reduce((a, b) -> a + b).get();

        System.out.println("Nums From 6th Index : " + from6);
        System.out.println("SUM : " + sum2); // 96
    }
}
