import java.util.Scanner;

public class Currency_Converter {

    public static void main(String[] args) {
        // Declare variables
        double inputAmount; // The amount to be converted
        String sourceCurrency; // The currency of the input amount
        String targetCurrency; // The currency to be converted to
        double exchangeRate; // The exchange rate between the source and target currencies
        double outputAmount; // The converted amount
        
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);
        
        // Get the input amount from the user
        System.out.print("Enter the amount to be converted: ");
        inputAmount = sc.nextDouble();
        
        // Get the source currency from the user
        System.out.print("Enter the source currency (USD, EUR, or GBP): ");
        sourceCurrency = sc.next().toUpperCase();
        
        // Get the target currency from the user
        System.out.print("Enter the target currency (USD, EUR, or GBP): ");
        targetCurrency = sc.next().toUpperCase();
        
        // Assign the exchange rate based on the source and target currencies
        // Assume the following exchange rates as of 02 Sep 2023:
        // 1 USD = 0.85 EUR
        // 1 USD = 0.73 GBP
        // 1 EUR = 1.18 USD
        // 1 EUR = 0.86 GBP
        // 1 GBP = 1.37 USD
        // 1 GBP = 1.16 EUR
        
        if (sourceCurrency.equals("USD")) {
            if (targetCurrency.equals("EUR")) {
                exchangeRate = 0.85;
            } else if (targetCurrency.equals("GBP")) {
                exchangeRate = 0.73;
            } else {
                exchangeRate = 1;
            }
        } else if (sourceCurrency.equals("EUR")) {
            if (targetCurrency.equals("USD")) {
                exchangeRate = 1.18;
            } else if (targetCurrency.equals("GBP")) {
                exchangeRate = 0.86;
            } else {
                exchangeRate = 1;
            }
        } else if (sourceCurrency.equals("GBP")) {
            if (targetCurrency.equals("USD")) {
                exchangeRate = 1.37;
            } else if (targetCurrency.equals("EUR")) {
                exchangeRate = 1.16;
            } else {
                exchangeRate = 1;
            }
        } else {
            // Invalid source currency
            System.out.println("Invalid source currency.");
            return; // Exit the program
        }
        
        // Calculate the output amount by multiplying the input amount by the exchange rate
        outputAmount = inputAmount * exchangeRate;
        
        // Display the output amount with the target currency symbol
        switch (targetCurrency) {
            case "USD":
                System.out.printf("%.2f %s = %.2f %s\n", inputAmount, sourceCurrency, outputAmount, "$");
                break;
            case "EUR":
                System.out.printf("%.2f %s = %.2f %s\n", inputAmount, sourceCurrency, outputAmount, "€");
                break;
            case "GBP":
                System.out.printf("%.2f %s = %.2f %s\n", inputAmount, sourceCurrency, outputAmount, "£");
                break;
            default:
                // Invalid target currency
                System.out.println("Invalid target currency.");
                break;
        }
        
    }
}
