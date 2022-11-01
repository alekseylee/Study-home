package be.intecbrussel.basic;

public class LoopExercises {
    public static void main(String [] args) {

        int summary = 0;
        for (int num = 0; num <= 5; num++) {
            summary += num;
        }
        double avg = summary / 5;
        System.out.println("De som is: " + summary + " het gemiddelde is: " + avg);

    }
}