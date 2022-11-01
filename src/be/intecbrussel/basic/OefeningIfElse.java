package be.intecbrussel.basic;

import java.util.Scanner;

public class OefeningIfElse {
    public static void main(String [] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0) {
            System.out.println("is even");

        } else {
            System.out.println("oneven");

        }
    }
}

