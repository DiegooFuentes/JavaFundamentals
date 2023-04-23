package variables_dataTypes_andOperators;

import java.sql.SQLOutput;
import java.util.Scanner;

//Activity 4: Inputting Student Information and Outputting an ID
public class SimpleIdCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = sc.nextLine();
        System.out.print("What's your university? ");
        String university = sc.nextLine();
        System.out.print("What's your age? ");
        int age = sc.nextInt();

        System.out.println("Here is your ID \n" +
                "************************** \n" +
                "Name: " + name + "\n" +
                "University: " + university + "\n" +
                "Age: " + age + "\n" +
                "**************************");

    }
}
