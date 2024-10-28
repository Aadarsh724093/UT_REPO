import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class currencyconverter {

    public static double convertCurrency(double amount, String fromCurrency, String toCurrency, Map<String, Double> exchangeRates) {
        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Invalid currency provided.");
        }

        // Convert from the original currency to USD
        double amountInUSD = amount / exchangeRates.get(fromCurrency);

        // Convert from USD to the target currency
        return amountInUSD * exchangeRates.get(toCurrency);
    }

    public static void main(String[] args) {
        // Example exchange rates (you can update these)
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);  // base currency
        exchangeRates.put("EUR", 0.85);
        exchangeRates.put("JPY", 110.0);
        exchangeRates.put("GBP", 0.75);
        exchangeRates.put("IND", 84.0);//exchangeRates.put("GBP", 0.75);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter amount: ");
            double amount = scanner.nextDouble();
            System.out.print("Convert from (USD, EUR, JPY, GBP, IND): ");
            String fromCurrency = scanner.next().toUpperCase();
            System.out.print("Convert to (USD, EUR, JPY, GBP, IND): ");
            String toCurrency = scanner.next().toUpperCase();

            double result = convertCurrency(amount, fromCurrency, toCurrency, exchangeRates);
            System.out.printf("%.2f %s is %.2f %s%n", amount, fromCurrency, result, toCurrency);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}