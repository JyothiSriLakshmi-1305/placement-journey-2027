import java.util.Scanner;

public class ModernSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Day: ");

        int day = sc.nextInt();
        String result = switch(day){

            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";

            default -> "Invalid Day";

        };
        

        System.out.println(result);
        sc.nextLine();
        System.out.println("Enter month name : ");
        String month=sc.next().toLowerCase();
        System.out.println("You entered: " + month);
        String days=switch(month){
        //if user enters month name then give how many days it will be
        case "january","march","may","july","august","october","december"-> "It have 31 days.";

        case "april","june","september","november" -> "It have 30 days..";
        case "february"->"It have 28 days if it is leap year then 29 days...";
        default->"Invalid month check correctly....";
        };
        System.out.println(days);

        sc.close();
    }
}