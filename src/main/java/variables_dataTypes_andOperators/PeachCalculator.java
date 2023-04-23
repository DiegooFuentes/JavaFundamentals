package variables_dataTypes_andOperators;

import java.util.Scanner;

//Activity 5: Calculating the Number of Full Fruit Boxes
public class PeachCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the number of peaches? ");
        int numberOfPeaches = sc.nextInt();
        int numberOfFullBoxes = (numberOfPeaches / 20);
        int numberOfPeachesLeft = (numberOfPeaches - (numberOfFullBoxes * 20));

        System.out.println("We have " + numberOfFullBoxes + " full boxes and " + numberOfPeachesLeft + " peaches left.");
    }
}
