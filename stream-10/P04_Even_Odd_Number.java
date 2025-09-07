import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P04_Even_Odd_Number {
    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(11, 2, 3, 45, 67, 9, 90, 87, 8, 2);

        // even
        List<Integer> evenList = arrList.stream()
                .filter(ele -> ele % 2 == 0)
                .collect(Collectors.toList());

        // odd
        List<Integer> oddList = arrList.stream()
                .filter(ele -> ele % 2 != 0)
                .toList();

        System.out.println("Even : " + evenList);
        System.out.println("Odd  : " + oddList);
    }
}
