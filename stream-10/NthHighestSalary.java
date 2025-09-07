import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NthHighestSalary {
    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();

        map1.put("ali", 1000);
        map1.put("basha", 1200);
        map1.put("charan", 1400);
        map1.put("david", 1600);
        map1.put("afreed", 1100);
        map1.put("dulqar", 1300);
        map1.put("naslen", 1500);
        map1.put("tom", 1700);

        System.out.println(map1);
        Map.Entry<String, Integer> result = getNthHighestSalary(2, map1);
        System.out.println(result);
    }

    public static Map.Entry<String, Integer> getNthHighestSalary(int num, Map<String, Integer> map) {
        return map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .toList()
                .get(num - 1);
    }
}

// [1000,1100,1200,1300,1400,1500,1600,1700]