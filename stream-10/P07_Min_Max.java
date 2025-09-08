import java.util.Arrays;
// import java.util.Comparator;
import java.util.List;

public class P07_Min_Max {
    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(-1, 0, 3, 10, 20, 30, 15, 1, 13, 1, 2, 2, 10, -40, 19, 3);

        int max = arrList.stream().max(Integer::compareTo).get();
        System.out.println("MAX : " + max);

        int min = arrList.stream().min(Integer::compareTo).get();
        System.out.println("MIN : " + min);
    }
}
/*
 * int max = arrList.stream().max(Comparator.comparing(Integer::valueOf)).get();
 * 
 * int min = arrList.stream().min(Comparator.comparing(Integer::valueOf)).get();
 * 
 */