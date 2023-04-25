package control_flow;
//Activity 6: Controlling the flow of execution using conditionals
public class SalaryCalculator {
    public static void main(String[] args) {
    int salary = payCalculator(11);
    System.out.println("Your salary is $" + salary);

    }

    public static int payCalculator(int hours){

        int salary;
        if(hours < 8){
            salary = hours * 10;
        } else if (hours < 12) {
            salary = 8 * 10 + (hours - 8) * 12;

        }else {
            salary = 160;
        }
        return salary;
    }
}
