package control_flow;
//Activity 7: Developing a Temperature System
public class WeatherAlerts {
    public static void main(String[] args) {

    String temp = "humid";
    String weatherWarning = weatherWarningSystem(temp);
    System.out.println(weatherWarning);
    }

    public static String weatherWarningSystem (String temp){

        String weatherWarning;
        switch (temp){
            case "high":
                weatherWarning = "High: In this case, suggest the user to use sunblock";
                break;
            case "low":
                weatherWarning = "Low: In this case, suggest the user to wear a coat";
                break;
            case "humid":
                weatherWarning = "Humid: In this case, suggest the user to open the windows";
                break;
            default:
                weatherWarning = "The weather looks good. Take a walk outside.";
                break;
        }
        return weatherWarning;
    }

}

