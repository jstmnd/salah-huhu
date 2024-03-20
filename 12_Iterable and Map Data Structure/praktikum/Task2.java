import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of digits:");
        String input = scanner.nextLine();

        List<Integer> uniqueDigits = findUniqueDigits(input);
        System.out.println("Digits that appear exactly once: " + uniqueDigits);
    }

    private static List<Integer> findUniqueDigits(String input) {
        Map<Character, Integer> digitCount = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (char c : input.toCharArray()) {
            digitCount.put(c, digitCount.getOrDefault(c, 0) + 1);
        }
        
        for (char c : input.toCharArray()) {
            if (digitCount.get(c) == 1 && !result.contains(Character.getNumericValue(c))) {
                result.add(Character.getNumericValue(c));
            }
        }

        return result;
    }
}