package control_flow;
//Exercise 6: Implementing a Simple if-else Statement
public class Booking {
    public static void main(String[] args) {

        int seats = 3;
        int req_ticket = 4;

        if( (req_ticket == seats) || (req_ticket < seats)){
            System.out.println("This booking can be accepted");
        }else{
            System.out.println("This booking is rejected");
        }
    }
}
