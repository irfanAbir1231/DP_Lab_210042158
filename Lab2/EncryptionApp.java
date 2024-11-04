import java.util.Scanner;

public class EncryptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EncryptionContext context = new EncryptionContext();

        System.out.println("Select encryption algorithm: 1. AES  2. DES  3. Caesar Cipher");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        try {
            switch (choice) {
                case 1:
                    context.setEncryptionStrategy(new AESEncryption());
                    break;
                case 2:
                    context.setEncryptionStrategy(new DESEncryption());
                    break;
                case 3:
                    System.out.println("Enter shift value for Caesar Cipher:");
                    int shift = scanner.nextInt();
                    context.setEncryptionStrategy(new CaesarCipherEncryption(shift));
                    break;
                default:
                    System.out.println("Invalid choice");
                    return;
            }

            System.out.println("Enter input file path:");
            String inputFile = scanner.next();
            System.out.println("Enter output encrypted file path:");
            String encryptedFile = scanner.next();

            context.processFile(inputFile, encryptedFile, true);

            System.out.println("File encrypted successfully. Enter output decrypted file path:");
            String decryptedFile = scanner.next();

            context.processFile(encryptedFile, decryptedFile, false);
            System.out.println("File decrypted successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
