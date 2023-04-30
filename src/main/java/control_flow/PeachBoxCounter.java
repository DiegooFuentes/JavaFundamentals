package control_flow;
import java.util.Scanner;
//Activity 8: Implementing the for loop
public class PeachBoxCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of peaches you've picked: ");
        int numberOfPeaches = sc.nextInt();

        for (int i = 0; i <= numberOfPeaches; i += 20){
            System.out.println("shipped " + i + " peaches so far");
        }
    }
}
