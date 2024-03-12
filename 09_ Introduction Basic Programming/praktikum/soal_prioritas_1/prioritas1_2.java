import java.util.Scanner;

public class prioritas1_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char loopInput;

        do {
            System.out.print("Panjang: ");
            int length = scanner.nextInt();

            System.out.print("Lebar: ");
            int width = scanner.nextInt();

            int area = calculate(length, width);
            result(area);

            System.out.print("Ingin menghitung luas persegi panjang lain? (Y/N): ");
            loopInput = scanner.next().charAt(0);
            scanner.nextLine();
        } while (Character.toUpperCase(loopInput) == 'Y');

        scanner.close();
    }

    private static int calculate(int length, int width) {
        return length * width;
    }

    private static void result(int area) {
        if (area % 2 == 0) {
            System.out.println("\"even rectangle\"");
        } else {
            System.out.println("\"odd rectangle\"");
        }
    }
}