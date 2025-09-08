import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class B_StringStreamExamples {
    public static void main(String[] args) {
        String str = "HELLO";
        String sentence = "Java Streams API";

        System.out.println("First non-repeated char: " + firstNonRepeatedChar(str));
        System.out.println("First repeated char: " + firstRepeatedChar(str));
        System.out.println("Occurrences of each char: " + charOccurrences(str));
        System.out.println("Most repeated char: " + mostRepeatedChar(str));

        System.out.println("Longest word in sentence: " + longestWord(sentence));

    }

    // 1. First non-repeated character
    public static Character firstNonRepeatedChar(String str) {
        return str.chars() // [104, 101, 108, 108, 111]
                .mapToObj(ch -> (char) ch) // [h, e, l, l, o]
                .filter(ch -> str.indexOf(ch) == str.indexOf(ch)) // [h-0, e-1, l-2, o-4]
                .findFirst().orElse('?'); // first or ?
    }

    // 2. First repeated character
    public static Character firstRepeatedChar(String str) {
        return str.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> str.indexOf(ch) != str.lastIndexOf(ch))
                .findFirst().orElse('?');
    }

    // 3. Count occurrences of each character
    public static Map<Character, Long> charOccurrences(String str) {
        return str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    // 4. Most repeated character
    public static Character mostRepeatedChar(String str) {
        return str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse('?');
    }

    // 5. Longest word in a sentence
    public static String longestWord(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .max(Comparator.comparing(String::length))
                .orElse("NOT FOUND");
    }
}
