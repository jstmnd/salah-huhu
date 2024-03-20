import java.util.Scanner;

public class prioritas2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char loopInput;

        do {
            System.out.print("Jumlah angka: ");
            int totalNumbers = scanner.nextInt();

            System.out.print("Nilai n: ");
            int divisor = scanner.nextInt();

            divisibleNumbers(totalNumbers, divisor);

            System.out.print("Ingin menghitung lagi? (Y/N): ");
            loopInput = scanner.next().charAt(0);
            scanner.nextLine();
        } while (Character.toUpperCase(loopInput) == 'Y');

        scanner.close();
    }

    private static void divisibleNumbers(int totalNumbers, int divisor) {
        int count = 0;
        int number = 1;

        while (count < totalNumbers) {
            if (number % divisor == 0) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}