package TasksLecture_1;

import java.util.Scanner;

public class CalculateFactorials {
    public static void main (String[] argv) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial");
        int x = scanner.nextInt();
        int factorial = 1;
        for (int i = x; i > 0; i--) {
            factorial *= i;
        }
        System.out.println("factorial of " + x + " equals " + factorial);
        scanner.close();
    }
}
