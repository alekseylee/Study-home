package be.intecbrussel.basic;

import java.util.Arrays;

public class LoopingArrays2d {
    public static void main(String[] args) {
        int[][] grades = {
                {66, 55, 33 ,22},
                {56, 50, 34, 25},
                {60, 56, 40, 26}
        };
        for (int j = 0; j < grades[0].length; j++ ) {
            System.out.print(" " + grades[0][j]);
        }
        for (int j = 0; j < grades[1].length; j++ ) {
            System.out.print(" " + grades[1][j]);
        }
        for (int j = 0; j < grades[2].length; j++ ) {
            System.out.print(" " + grades[2][j]);
        }
//        for (int i = 0; i < grades.length; i++) {
//            for (int j = 0; j < grades[i].length; j++) {
//                System.out.print(grades[i][j]);
//            }
//        }

    }
}
