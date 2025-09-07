import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P10_Get_2nd_Highest_Lowest_Number {
    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(0, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 40, 19, 3, 40);

        int second_Highest = arrList.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                // .limit(2)
                .skip(1)
                .findFirst().get();
        System.out.println("2nd Highest : " + second_Highest);

        int second_Lowest = arrList.stream()
                .sorted()
                .distinct()
                // .limit(2)
                .skip(1)
                .findFirst().get();
        System.out.println("2nd Lowest : " + second_Lowest);
    }
}
