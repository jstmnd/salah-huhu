import java.util.Scanner;

public class eksplorasi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char loopInput;

        do {
            System.out.print("Kata: ");
            String word = scanner.nextLine();

            String camelCase = changeToCamelCase(word);
            System.out.println(camelCase);

            System.out.print("Ingin mengubah kata lain? (Y/N): ");
            loopInput = scanner.next().charAt(0);
            scanner.nextLine();
        } while (Character.toUpperCase(loopInput) == 'Y');

        scanner.close();
    }

    private static String changeToCamelCase(String word) {
        StringBuilder builder = new StringBuilder();
        boolean isNextCharUpperCase = false;

        for (char ch : word.toCharArray()) {
            if (ch == ' ') {
                isNextCharUpperCase = true;
            } else {
                if (builder.length() == 0) {
                    builder.append(Character.toLowerCase(ch));
                } else if (isNextCharUpperCase) {
                    builder.append(Character.toUpperCase(ch));
                } else {
                    builder.append(Character.toLowerCase(ch));
                }
                isNextCharUpperCase = false;
            }
        }

        return builder.toString();
    }
}