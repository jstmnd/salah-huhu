import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array (in format [num1, num2, ...]):");
        String input = scanner.nextLine();

        Matcher matcher = Pattern.compile("\\d+").matcher(input);
        int[] array = matcher.results().mapToInt(match -> Integer.parseInt(match.group())).toArray();

        System.out.println("Enter the value of k:");
        int k = scanner.nextInt();

        int result = findMaxSumSubarray(array, k);
        System.out.println("Maximum sum of a contiguous subarray of size " + k + ": " + result);
    }

    private static int findMaxSumSubarray(int[] array, int k) {
        int maxSum = 0, windowSum = 0;
        int start = 0;

        for (int end = 0; end < array.length; end++) {
            windowSum += array[end];

            if (end >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= array[start];
                start++;
            }
        }

        return maxSum;
    }
}