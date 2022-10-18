package be.intecbrussel.classwerk10;

public class MainApp {
    public static void main(String[] args) {

        Day day = Day.TUESDAY;
//        System.out.println(day);

//        switch (day) {
//            case MONDAY:
//                System.out.println("This is Monday");
//                break;
//            case TUESDAY:
//                System.out.println("This is Tuesday");
//                break;
//            case WEDNESDAY:
//                System.out.println("This is Wednesday");
//                break;
//            case THURSDAY:
//                System.out.println("This is Thursday");
//                break;
//            case FRIDAY:
//                System.out.println("This is Friday");
//                break;
//            case SATURDAY:
//                System.out.println("This is Saturday");
//                break;
//            case SUNDAY:
//                System.out.println("This is Sunday");
//                break;
//            default:
//                System.out.println("No valid input of day");
//                break;
//        }

//        Day[] myDayArr = Day.values();
//        for (Day today : myDayArr) {
//            System.out.println(today + " at index " + today.ordinal());
//
//        }

        day.defaultDay();
        System.out.println(day);

        Color color = Color.BLUE;

        System.out.println(color.getColorCode());

    }
}
