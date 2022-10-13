package be.intecbrussel;

import java.util.Arrays;

public class Arrays2d {
    public static void main(String[] args) {

        int[][] grades = {
                {66, 55, 33 ,22},
                {56,50,34,25},
                {60, 56, 40, 26}
        };

        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + Arrays.toString(grades[1]));
        System.out.println("\tHermiona: " + Arrays.toString(grades[2]));



    }
}
