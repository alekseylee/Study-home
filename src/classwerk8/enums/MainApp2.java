package classwerk8.enums;

import java.util.Scanner;

enum Day2 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

public class MainApp2 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day");
        // Declaring Enum variable
        Day2 inputDay;
        inputDay = Day2.valueOf(scan.nextLine());
        // Switch keyword
        switch (inputDay) {

            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case TUESDAY:
                System.out.println("Tuesdays are bad.");
                break;
            case WEDNESDAY:
                System.out.println("Wednesdays are bad.");
                break;
            case THURSDAY:
                System.out.println("Thursdays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("No valid input of day");
                break;

        }
    }
}