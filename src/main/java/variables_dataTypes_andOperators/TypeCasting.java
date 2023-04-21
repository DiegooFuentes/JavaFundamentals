package variables_dataTypes_andOperators;

import java.util.Scanner;

//Exercise 5: Type Casting
public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();

        System.out.println("Entered value is: " + num1);
        float fl1 = num1;
        System.out.print("Entered value as a floating point variable is: " + fl1);
    }
}
