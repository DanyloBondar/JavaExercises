package TasksLecture_1;

public class PriceBeforeTax {
    public static void main(String[] args) {
        float tax;
        tax = 8;
        int price = 60;
        double prePrice = price / (1 + tax / 100);
        prePrice = Math.round(prePrice * 10) / 10.0;
        System.out.println("Price before tax is: " + prePrice);
        double result = price - (price / (1 + tax / 100));
        result = Math.round(result * 10) / 10.0;
        System.out.println("VAT for this product is: " + result);
    }
}
