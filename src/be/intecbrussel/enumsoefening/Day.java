package be.intecbrussel.enumsoefening;

public enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    Day() {
        System.out.println("\t" + this.toString());
    }
        public void defaultDay () {
            System.out.println("Default day is Sunday");
        }
}



