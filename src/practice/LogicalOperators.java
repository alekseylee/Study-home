package practice;

public class LogicalOperators {
    public static void main(String [] args) {
        int chemistryGrade = 78;
        int englishGrade = 65;
        String language = "Java";
                                //One of expressions should be "TRUE" or work "else" function
        if (chemistryGrade > 75 || language.equals("Java") || englishGrade > 75) {
            System.out.println("Congratulations, you got the scholarship!");
        } else {
            System.out.println("We're sorry, you didn't get the scholarship.");
        }

        int credits = 56;
        double GPA = 3.2;
                            //Every expressions should be "TRUE" or work "else" function
        if (credits >= 40 && GPA >= 2.0) {
            System.out.println("You earned you diploma!");
        } else {
            System.out.println("Sorry, you need at least 40 credits and a minimum GPA of 2.0");

            String option = "neither";
            boolean comparison = !(option.equals("cash") || option.equals("credit"));
        }
    }
}
