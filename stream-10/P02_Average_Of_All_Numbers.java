import java.util.Arrays;
import java.util.List;

public class P02_Average_Of_All_Numbers{
    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(1, 2, 3, 4, 5);

        double avg = arrList.stream().mapToInt(ele -> ele).average().getAsDouble();

        System.out.println("Avg : " + avg);
    }
}
