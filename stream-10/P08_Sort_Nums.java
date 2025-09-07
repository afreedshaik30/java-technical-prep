import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class P08_Sort_Nums {
    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(0, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, 40, 19, 3, 40);

        List<Integer> asc = arrList.stream().sorted().toList();
        List<Integer> desc = arrList.stream().sorted(Comparator.reverseOrder()).toList();

        System.out.println("ASC : " + asc);
        System.out.println("DESC : " + desc);

    }
}
