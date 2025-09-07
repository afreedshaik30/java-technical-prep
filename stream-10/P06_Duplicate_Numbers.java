import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class P06_Duplicate_Numbers{
    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(1, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 30, 19, 3);

        // 1. using Collections.frequency(list,ele)
        Set<Integer> duplicates1 = arrList.stream()
                .filter(ele -> Collections.frequency(arrList, ele) > 1)
                .collect(Collectors.toSet());

        // 2. using Set
        Set<Integer> unqNums = new HashSet<>(); // intially(Empty), all distinct values of arrList
        Set<Integer> duplicates2 = arrList.stream() // Only duplicates2 will collect the "false" cases from add()
                .filter(ele -> !unqNums.add(ele))
                .collect(Collectors.toSet());

        System.out.println(duplicates1);
        System.out.println(duplicates2);
    }
}
