package be.intecbrussel.classwerk10;

public enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    Day() {
        System.out.println(this.toString());
    }
        public void defaultDay () {
            System.out.println("Default day is Sunday");
        }
}



