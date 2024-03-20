import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first array (in format [num1, num2, ...]):");
        String input1 = scanner.nextLine();
        int[] array1 = parseArrayString(input1);

        System.out.println("Enter the second array (in format [num1, num2, ...]):");
        String input2 = scanner.nextLine();
        int[] array2 = parseArrayString(input2);

        int[] result = findInFirstArray(array1, array2);
        System.out.print("Output: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private static int[] parseArrayString(String arrayString) {
        String[] items = arrayString.trim().substring(1, arrayString.length() - 1).split(",\\s*");
        int[] result = new int[items.length];
        for (int i = 0; i < items.length; i++) {
            result[i] = Integer.parseInt(items[i]);
        }
        return result;
    }

    private static int[] findInFirstArray(int[] array1, int[] array2) {
        Set<Integer> setForSecondArray = new HashSet<>();
        for (int element : array2) {
            setForSecondArray.add(element);
        }

        List<Integer> resultList = new ArrayList<>();
        for (int element : array1) {
            if (!setForSecondArray.contains(element)) {
                resultList.add(element);
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        return resultArray;
    }
}

