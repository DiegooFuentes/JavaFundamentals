package control_flow;

import java.util.Scanner;

//Exercise 7: Implementing the else-if Statements
public class DeliveryFee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your distance?");
        int distance = sc.nextInt();
        sc.close();
        int fee = deliveryFeeCalculator(distance);
        System.out.println("Delivery Fee: $" + fee);

    }

    public static int deliveryFeeCalculator(int distance){

        int fee = 0;
        if (distance > 0 && distance < 5){
            fee = 2;
        } else if (distance >= 5 && distance < 15 ) {
            fee = 5;
        } else if (distance >= 15 && distance < 25){
            fee = 10;
        } else if (distance >= 25 && distance < 50) {
            fee = 15;
        }else {
            fee = 20;
        }
        return fee;
    }

}
