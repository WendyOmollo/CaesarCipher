import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Encrypt or decrypt?");
        String choice = input.next();

        if (choice.equals("Encrypt")) {
            System.out.println("Enter the text to decrypt");
            String response = input.next();
            System.out.println("Enter the key");
            int key = input.nextInt();
            Encrypt testEncryption = new Encrypt(response, key);
            testEncryption.setEncrypted();
            System.out.println(testEncryption.setEncrypted());
        } else if (choice.equals("decrypt")) {
            System.out.println("Enter the text to decrypt");
            String response = input.next();
            System.out.println("Enter the key");
            int key = input.nextInt();
            Decrypt testDecryption = new Decrypt(response, key);
            testDecryption.setDecrypted();
            System.out.println(testDecryption.setDecrypted());
        } else {
            System.out.println("Invalid");
        }
    }
}