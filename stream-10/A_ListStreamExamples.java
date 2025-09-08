import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
// import java.util.Scanner;
import java.util.Map;
import java.util.stream.Collectors;

public class A_ListStreamExamples {
    public static void main(String[] args) {
        List<Integer> arrList = Arrays.asList(10, 15, 21, 11, 30, 15, 50, 7);

        // System.out.println("Numbers starting with 1: " +
        // getNumsStartsWith_1(arrList));
        // System.out.println("Duplicate elements: " + findDuplicateElements(arrList));
        // System.out.println("Largest element: " + findLargestElement(arrList));
        // System.out.println("Sorted in descending: " + sortDESC(arrList));
        // System.out.println("Contains duplicates? " + containsDuplicates(arrList));
        // System.out.println("Cube > 50: " + cubeAndFilterGreaterThan50(arrList));

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a num for nth largest :7");
        // int num = sc.nextInt();
        // System.out.println(num + " th largest element: " + findNthLargestNum(num,
        // arrList));
        // sc.close();

        // System.out.println("Sum of even numbers: " + sumOfEvenNumbers(arrList));

        List<List<String>> nested = Arrays.asList(Arrays.asList("A", "B", "C"), Arrays.asList("1", "2", "3"));
        // System.out.println("Flattened list: " + flattenListOfLists(nested));

        // System.out.println(
        // "Common elements: " + findCommonElements(Arrays.asList("A", "B", "C"),
        // Arrays.asList("B", "C", "D")));

        // System.out.println("Partition Even/Odd: " + partitionEvenOdd(arrList));
        // System.out.println("Comma separated string: " + toCommaSeparated(arrList));

        System.out.println("Total chars in words list: " + totalCharsInList(Arrays.asList("Hello", "World", "Java")));
    }

    // 1. Find numbers starting with 1
    public static List<Integer> getNumsStartsWith_1(List<Integer> nums) {
        return nums.stream()
                .filter(ele -> ele.toString().startsWith("1"))
                .toList();
    }

    // 2. Find duplicate elements
    public static List<Integer> findDuplicateElements(List<Integer> nums) {
        HashSet<Integer> unqNums = new HashSet<>();
        return nums.stream()
                .filter(ele -> !unqNums.add(ele))
                .toList();
    }

    // 3. Find largest element
    public static Integer findLargestElement(List<Integer> nums) {
        return nums.stream()
                .max(Integer::compareTo)
                .get();
    }

    // 4. Sort in descending order
    public static List<Integer> sortDESC(List<Integer> nums) {
        return nums.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    // 5. Check if list contains duplicates
    public static boolean containsDuplicates(List<Integer> nums) {
        return nums.stream()
                .distinct().count() != nums.size();
    }

    // 6. Cube elements & filter > 50
    public static List<Integer> cubeAndFilterGreaterThan50(List<Integer> nums) {
        return nums.stream()
                .map(ele -> ele * ele * ele)
                .filter(ele -> ele > 50)
                .toList();
    }

    // 7. Find nth largest element
    public static Integer findNthLargestNum(int n, List<Integer> nums) {
        return nums.stream() // [10, 15, 21, 11, 30, 15, 50, 7]
                .distinct() // [10, 15, 21, 11, 30, 50, 7]
                .sorted(Comparator.reverseOrder()) // [50, 30, 21, 15, 11, 10, 7]
                .skip(n - 1) // [30, 21, 15, 11, 10, 7]
                .findFirst().orElse(null); // nth largest num (or) null
    }

    // 8. Find sum of even numbers
    public static Integer sumOfEvenNumbers(List<Integer> nums) {
        return nums.stream()
                .filter(ele -> ele % 2 == 0)
                .reduce((a, b) -> a + b)
                .get();
    }

    // 9. Flatten list of lists
    public static List<String> flattenListOfLists(List<List<String>> nestedList) {
        return nestedList.stream()
                .flatMap(List::stream)
                .toList();
    }

    // 10. Find common elements in two lists
    public static List<String> findCommonElements(List<String> list1, List<String> list2) {
        return list1.stream().filter(list2::contains).toList();
    }

    // 11. Partition into even & odd
    public static Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> nums) {
        return nums.stream()
                .collect(Collectors.partitioningBy(ele -> ele % 2 == 0));
    }

    // 12. Convert list to comma-separated string
    public static String toCommaSeparated(List<Integer> nums) {
        return nums.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    // 13. Total number of characters in a list of strings
    public static Integer totalCharsInList(List<String> nums) {
        return nums.stream()
                // .mapToInt(s -> String.valueOf(s).length())
                .mapToInt(String::length)
                .sum();
    }
}
