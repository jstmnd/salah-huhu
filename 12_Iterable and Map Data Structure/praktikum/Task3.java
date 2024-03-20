import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sorted numbers (in format [num1, num2, ...]):");
        String inputLine = scanner.nextLine().trim();

        String[] inputNumbers = inputLine.substring(1, inputLine.length() - 1).split(",\\s*");
        int[] numbers = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i].trim());
        }

        System.out.println("Enter the target sum:");
        int target = scanner.nextInt();

        int[] result = findPair(numbers, target);
        if (result.length == 2) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No pair found that adds up to the target sum.");
        }
    }

    private static int[] findPair(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            if (currentSum == target) {
                return new int[]{left, right};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[0];
    }
}
