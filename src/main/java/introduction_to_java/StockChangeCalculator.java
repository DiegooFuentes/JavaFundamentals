package introduction_to_java;
//Activity 3: Calculating the percent Increase or Decrease of Financial Instruments
import java.util.Scanner;

public class StockChangeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the stock symbol: ");
        String symbol = sc.nextLine();

        System.out.printf("Enter %s's day 1 value: ", symbol.toUpperCase());
        double day1 = sc.nextDouble();
        System.out.printf("Enter %s's day 2 value: ", symbol.toUpperCase());
        double day2 = sc.nextDouble();

        double percentChange = 100 * (day2 - day1) / day1;
        System.out.printf("%s has changed %.2f%% in one day",symbol.toUpperCase(),percentChange);
    }
}
