import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {

    static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String NUMBERS = "0123456789";
    static final String SPECIAL = "!@#$%^&*()-_=+[]{};:,.<>?";

    static SecureRandom random = new SecureRandom();

    public static String generatePassword(
            int length,
            boolean useLower,
            boolean useUpper,
            boolean useNumbers,
            boolean useSpecial) {

        StringBuilder characters = new StringBuilder();

        if (useLower) {
            characters.append(LOWERCASE);
        }

        if (useUpper) {
            characters.append(UPPERCASE);
        }

        if (useNumbers) {
            characters.append(NUMBERS);
        }

        if (useSpecial) {
            characters.append(SPECIAL);
        }

        if (characters.length() == 0) {
            return "";
        }

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }

        return password.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("       JAVA PASSWORD GENERATOR");
        System.out.println("====================================");

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        if (length < 4) {
            System.out.println(
                "Password length should be at least 4."
            );
            scanner.close();
            return;
        }

        System.out.print("Include lowercase letters? (y/n): ");
        char lowerChoice = scanner.next().toLowerCase().charAt(0);

        System.out.print("Include uppercase letters? (y/n): ");
        char upperChoice = scanner.next().toLowerCase().charAt(0);

        System.out.print("Include numbers? (y/n): ");
        char numberChoice = scanner.next().toLowerCase().charAt(0);

        System.out.print("Include special characters? (y/n): ");
        char specialChoice = scanner.next().toLowerCase().charAt(0);

        boolean useLower = lowerChoice == 'y';
        boolean useUpper = upperChoice == 'y';
        boolean useNumbers = numberChoice == 'y';
        boolean useSpecial = specialChoice == 'y';

        String password = generatePassword(
            length,
            useLower,
            useUpper,
            useNumbers,
            useSpecial
        );

        if (password.isEmpty()) {
            System.out.println(
                "\nPlease select at least one character type."
            );
        } else {
            System.out.println("\n====================================");
            System.out.println("Generated Password:");
            System.out.println(password);
            System.out.println("====================================");
        }

        scanner.close();
    }
}
