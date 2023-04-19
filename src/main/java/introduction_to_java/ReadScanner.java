package introduction_to_java;

import java.util.Scanner;

//Activity 2: Reading Values from the User and Performing OperationsUsing the Scanner Class
public class ReadScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = scanner.nextInt();
        scanner.close(); // We need to close the scanner in order not to have memory leak, if
        // we don't close it Java won't garbage collect
        System.out.println("The sum is " + (a + b));
    }
}
