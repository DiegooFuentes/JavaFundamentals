package introduction_to_java;

public class ProductOfNos {
    public static void main(String[] args) {
        System.out.println("Enter the first number:");
        int var1 = Integer.parseInt(System.console().readLine()); //This only works in terminal
        System.out.println("Enter the second number:");
        int var2 = Integer.parseInt(System.console().readLine()); //Only works in terminal
        System.out.printf("The product of the two numbers is %d", (var1 * var2));
    }
}
