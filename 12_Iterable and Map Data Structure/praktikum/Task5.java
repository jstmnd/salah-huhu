import java.util.Scanner;

public class Task5 {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int j = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array elements (in format [num1, num2, ...]):");
        String input = scanner.nextLine();

        String[] numberStrs = input.replaceAll("\\[|\\]", "").split(",\\s*");
        int[] nums = new int[numberStrs.length];

        for (int i = 0; i < numberStrs.length; i++) {
            nums[i] = Integer.parseInt(numberStrs[i]);
        }

        int newLength = removeDuplicates(nums);

        System.out.println("Output: " + newLength);
    }
}
