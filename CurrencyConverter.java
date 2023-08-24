import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exchange rates
        double usdToEurRate = 0.85;
        double usdToGbpRate = 0.73;
        double usdToJpyRate = 110.16;
        double usedoller    = 0.012;

        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();

        System.out.println("Choose currency to convert to:");
        System.out.println("1. Euro (EUR)");
        System.out.println("2. British Pound (GBP)");
        System.out.println("3. Japanese Yen (JPY)");
        System.out.println("4. United State Doller");


        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        double convertedAmount = 0;

        switch (choice) {
            case 1:
                convertedAmount = usdAmount * usdToEurRate;
                System.out.println("Converted amount in Euro (EUR): " + convertedAmount);
                break;
                
            case 2:
                convertedAmount = usdAmount * usdToGbpRate;
                System.out.println("Converted amount in British Pound (GBP): " + convertedAmount);
                break;
            case 3:
                convertedAmount = usdAmount * usdToJpyRate;
                System.out.println("Converted amount in Japanese Yen (JPY): " + convertedAmount);
                break;
            case 4:
                convertedAmount = usdAmount * usedoller;
                System.out.println("converted amount in doller :" + convertedAmount);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
