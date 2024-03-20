import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;

public class Task1 {
    private static String[] inputString(String input) {
        String[] array = input.trim().substring(1, input.length() - 1).split(",\\s*");
        return array;
    }

    public static String[] mergeArray(String[] array1, String[] array2) {
        Set<String> mergedSet = new LinkedHashSet<>();
        mergedSet.addAll(Arrays.asList(array1));
        mergedSet.addAll(Arrays.asList(array2));
        String[] mergedArray = mergedSet.toArray(new String[0]);
        return mergedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first array in the format ['item1', 'item2', ...]:");
        String input1 = scanner.nextLine();
        String[] array1 = inputString(input1);

        System.out.println("Enter the second array in the format ['item1', 'item2', ...]:");
        String input2 = scanner.nextLine();
        String[] array2 = inputString(input2);

        String[] result = mergeArray(array1, array2);
        System.out.println("Merged array without duplicates: " + Arrays.toString(result));
    }
}
