package TasksLecture_1;

import java.util.Scanner;
public class CalculateInterest {
    public static void main(String[] args) {
        double bankAccount;
        double interestRate = 0.5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("For how many years you want to invest money?");
        int numberofYears = scanner.nextInt();
        System.out.println("How much money?");
        bankAccount = scanner.nextDouble();
        double finalBankAccount = bankAccount * Math.pow(1 + (interestRate/10), numberofYears);

        finalBankAccount = Math.round(finalBankAccount * 10) / 10.0;
        System.out.println("At the end of year " + numberofYears + " , the account balance is " + finalBankAccount);
    }
}
