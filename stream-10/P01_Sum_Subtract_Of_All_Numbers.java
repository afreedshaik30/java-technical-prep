
// import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
// import java.util.stream.Collectors;

public class P01_Sum_Subtract_Of_All_Numbers {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 };

        // List<Integer> arrList = new ArrayList<>();
        // for (Integer ele : arr) {
        // arrList.add(ele);
        // }

        List<Integer> arrList = Arrays.stream(arr).boxed().toList();
        // System.out.println(arrList);

        Optional<Integer> sum = arrList.stream().reduce((a, b) -> a + b);
        int subtract = arrList.stream().reduce(0, (a, b) -> a - b);

        System.out.println("sum : " + sum.get());
        System.out.println("subract : " + subtract);
    }
}

/*
 * reduce(BinaryOperator<T> accumulator) → returns Optional<T>
 * reduce(identity, accumulator) → returns T
 */