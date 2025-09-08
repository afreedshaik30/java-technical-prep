import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P05_Starts_With_Prefix2 {
    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(2, 222, 234, 567, 890, 432, 236, 211, 22);

        List<Integer> prefix2_Num = arrList.stream()
                // .map(ele -> String.valueOf(ele))
                .filter(ele -> ele.toString().startsWith("2"))
                // .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println("Nums whose Prefix with 2 : " + prefix2_Num);
    }
}
