import java.util.Scanner;

public class prioritas2_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char loopInput;

        do {
            System.out.print("Kata: ");
            String word = scanner.nextLine();

            String replacedWord = replaceVowels(word);
            System.out.println(replacedWord);

            System.out.print("Ingin mengganti huruf vokal pada kata lain? (Y/N): ");
            loopInput = scanner.next().charAt(0);
            scanner.nextLine();
        } while (Character.toUpperCase(loopInput) == 'Y');

        scanner.close();
    }

    private static String replaceVowels(String word) {
        return word.replace('A', '4')
                .replace('a', '4')
                .replace('E', '3')
                .replace('e', '3')
                .replace('I', '1')
                .replace('i', '1')
                .replace('O', '0')
                .replace('o', '0');
    }
}