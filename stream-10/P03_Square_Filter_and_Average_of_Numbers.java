import java.util.Arrays;
import java.util.List;

public class P03_Square_Filter_and_Average_of_Numbers {
    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(1, 10, 20, 30, 15);

        // square - 1,100,400,900,225
        // filter 100 < - 400,900,225
        // avg of (400,900,225)/3 = 508.33333

        double ans = arrList.stream().map(ele -> ele * ele)
                .filter(ele -> ele > 100)
                .mapToInt(ele -> ele).average().getAsDouble();

        System.out.println("Ans : " + ans);
    }
}
