package TasksLecture_1;

import java.util.Scanner;
public class CaeserCipher {
    public static char shiftLetter(char letter, int key) {
        if (Character.isLetter(letter)) {
            char base = Character.isLowerCase(letter) ? 'a' : 'A';
            return (char) ((letter - base + key) % 26 + base);
        }
        return letter;
    }

    public static String encrypt(String text, int key) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            encrypted.append(shiftLetter(letter, key));
        }
        return encrypted.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the key for Ceaser cipher");
        int key = scanner.nextInt();;
        if (key > 0) {
            key = key % 26;
        } else {
            key = key % 26 + 26;
        }
        System.out.println("Enter a text for Ceaser cipher");
        String text = scanner.nextLine();
        scanner.close();
        System.out.println("Encrypted text is: " + encrypt(text, key));
    }
}
