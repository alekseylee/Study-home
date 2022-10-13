package classwerk8.enums;

public class MainApp {
    public static void main(String[] args) {
        Day[] myDayArr = Day.values();
        for (Day today : myDayArr) {
            System.out.println(today + " at index " + today.ordinal());
        }
    }
}

