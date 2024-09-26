import java.util.Scanner;
public class HighestBills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sum to be represented");
        double amount = scanner.nextDouble();
        String result = "";

        int[] arr = {1000, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] arrRapens = {50, 20, 10, 5, 1};

        int rapens = (int) Math.round((amount % 1) * 100);
        int sum = (int) Math.floor(amount);

        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            while (sum / arr[i] > 0) {
                k = sum / arr[i];
                sum = sum % arr[i];
            }
            if (k > 0) {
                result += arr[i] + " franc bills: " + k + "\n";
            }
            k = 0;
        }

        for (int i = 0; i < arrRapens.length; i++) {
            int k = 0;
            while (rapens / arrRapens[i] > 0) {
                k = rapens / arrRapens[i];
                rapens = rapens % arrRapens[i];
            }
            if (k > 0) {
                result += arrRapens[i] + " franc rapens: " + k + "\n";
            }
        }

        System.out.println(result);
    }
}
